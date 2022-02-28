package AbstractionsInterfaces;

public class Tolik implements Librarian{
    public static String name;
    public static String worker;
    public Tolik(String name,String worker){
        this.name = name;
        this.worker = worker;
    }
    @Override
    public void librarian() {
        System.out.println(worker + " " + name + " заказывает книги.");
    }
}
