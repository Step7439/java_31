package ClassStructure;

public class Main {
    public static void main(String[] args) {
        System.out.println("Максимальный ретинг: " + Book.maxRetings);
        Book book1 = new Book("Прогромирования на Java",1214, 2);
        book1.toString();
        System.out.println("Максимальный ретинг: " + Book.maxRetings);
        Book book2 = new Book("Философия Java",1164, 4 );
        book2.toString();
        System.out.println("Максимальный ретинг: " + Book.maxRetings);

    }
}
