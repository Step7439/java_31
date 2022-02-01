package ClassStructure;

public class Book {
    public static int maxRetings = 0;
    public String name;
    public int pages;
    public int reting;

    public Book(String name, int pages, int reting){
        this.name = name;
        this.pages = pages;
        this.reting = reting;
        maxRetings = Math.max(maxRetings, reting);
    }
    public String toString(){
        System.out.println("Названия книги: " + name + " Страниц: " + pages + " Реитинг: " + reting);
        return null;
    }
}
