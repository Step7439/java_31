package ClassStructure;

public class Book {
    public static int maxRetings = 0;
    public static int booksScore = 0;
    public String name;
    public int pages;
    public int reting;
    public Auhtor auhtor;

    public Book(String name, int pages, int reting){
        this.name = name;
        this.pages = pages;
        this.reting = reting;
        maxRetings = Math.max(maxRetings, reting);
        booksScore++;
    }
    public String toString(){
        System.out.println("Названия книги: " + name + " Страниц: " + pages + " Реитинг: " + reting);
        return null;
    }
    public static void bookScore(){
        System.out.printf("В нашей библиотеки: " + booksScore + " книги!");
    }
}
