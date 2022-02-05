package ClassStructure;

public class Book {
    public static int maxRetings = 0;
    public String name;
    public int pages;
    public int reting;
    public Auhtor auhtor;

    public Book(String name, int pages, int reting, Auhtor auhtor){
        this.name = name;
        this.pages = pages;
        this.reting = reting;
        this.auhtor = auhtor;
        maxRetings = Math.max(maxRetings, reting);
    }
    public String toString(){
        System.out.println("Названия книги: " + name + " Страниц: " + pages + " Реитинг: " + reting );
        System.out.println("Автор книги: " + auhtor.titel + " Год издания: " + auhtor.yuar);
        return null;
    }
}
