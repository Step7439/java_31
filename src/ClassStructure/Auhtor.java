package ClassStructure;

public class Auhtor {
    public String titel;
    public int yuar;
    public Book book;

    public Auhtor(String titel, int yuar, Book book){
        this.titel = titel;
        this.yuar = yuar;
        this.book = book;

    }
    public String toString(){
        System.out.println("Автор книги: " + titel + " Год издания: " + yuar);
        return null;
    }
}
