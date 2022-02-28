package AbstractionsInterfaces;

public class Vasay implements Supplier {
     String name;
     String worker;
    public Vasay(String name, String worker){
        this.name = name;
        this.worker = worker;
    }

    @Override
    public void customers(Vasay supplier) {
        System.out.println(worker + " " + name + " приносит книги в библиотеку.");
    }
}
