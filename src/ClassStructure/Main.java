package ClassStructure;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Изучаем Java",605, 5);
        Book book2 = new Book("Философия Java",1164, 4 );
        Auhtor auhtor1 = new Auhtor("Кэти Сьерра, Берт Бейтс", 2012);
        Auhtor auhtor2 = new Auhtor("Брюс Эккель",2019);

        book1.toString();
        auhtor1.toString();
        System.out.println();

        book2.toString();
        auhtor2.toString();
        System.out.println();

        System.out.println("Максимальный ретинг: " + Book.maxRetings);
    }
}
