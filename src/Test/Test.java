package Test;

package ru.netology.graphics.image;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class MyConverter implements TextGraphicsConverter{

    private TextColorSchema schema = new MyColorSchema();
    private int maxWidth = 0;
    private int maxHeight = 0;
    private double maxRatio = 0;

    @Override
    public String convert(String url) throws IOException, BadImageSizeException {
//скачиваем картинку


        BufferedImage img = ImageIO.read(new URL(url));

//проверяем соотношение сторон

        if(this.maxRatio != 0){
            double imgRatio = (double)img.getWidth() / img.getHeight();
            if(imgRatio > this.maxRatio){
                throw new BadImageSizeException(imgRatio, this.maxRatio);
            }
        }
// изменяем размеры

        int newWidth = img.getWidth();
        int newHeight = img.getHeight();

        if(newWidth > this.maxWidth){

            double ratio = (double)newWidth / this.maxWidth;
            newWidth = (int)(newWidth / ratio);
            newHeight = (int)(newHeight / ratio);
        }
        if(newHeight > this.maxHeight){
            double ratio = (double)newHeight / this.maxHeight;
            newWidth = (int)(newWidth / ratio);
            newHeight = (int)(newHeight / ratio);
        }

// перезаписываем обновленную картинку

        Image scaledImage = img.getScaledInstance(newWidth, newHeight, BufferedImage.SCALE_SMOOTH);
// создаем пустую заготовку

        BufferedImage bwImg = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_BYTE_GRAY);

// создаем инструмент для рисования на ней

        Graphics2D graphics = bwImg.createGraphics();
// копируем содержимое из суженной картинки в graphics

        graphics.drawImage(scaledImage, 0, 0, null);
// готовим объекты для прохода по пикселям

        var bwRaster = bwImg.getRaster();
        int[] intBuff = new int[3];
        StringBuffer sb = new StringBuffer();
// проходимся циклом по массиву и получаем соответствующий символ “с” из класса MyColorSchema

        for (int h = 0; h < newHeight; h++){
            for (int w = 0; w < newWidth; w++){
                int color = bwRaster.getPixel(w, h, intBuff)[0];
                char c = schema.convert(color);
                sb.append(c);
                sb.append(c);
            }
            sb.append("\n");
        }
// собираем весь текст и возвращаем

        return sb.toString();

    }
// переопределяем набор методов, которые задают настройки конвертора

    @Override
    public void setMaxWidth(int width) {
        this.maxWidth = width;
    }

    @Override
    public void setMaxHeight(int height) {
        this.maxHeight = height;
    }

    @Override
    public void setMaxRatio(double maxRatio) {
        this.maxRatio = maxRatio;
    }

    @Override
    public void setTextColorSchema(TextColorSchema schema) {
        this.schema = schema;
    }
}

2. Класс: MyColorSchema
        package ru.netology.graphics.image;

public class MyColorSchema implements TextColorSchema{
// определяем массив символов, 8 шт.

    private char [] schema = { '#', '$', '@', '%', '*', '+', '-', '\'', ' '};
// масштабируем 255 цветов к комбинации 8 символов. // Для использования в классе MyConverter в цикле, где конвертируется графика в символы.

    @Override
    public char convert(int color) {
        return schema[color / (255 / 8)];
    }
}
