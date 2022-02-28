package AbstractionsInterfaces;

public class Pety implements Reader,Supplier {
    String name;
    String worker;
    public Pety(String name,String worker){
        this.name = name;
        this.worker = worker;
    }
    @Override
    public void readers() {
        System.out.println(worker + " " + name + " берет и возвращает книги.");
    }

    @Override
    public void customers(Vasay supplier) {
        System.out.println();
        System.out.println(worker + " " + name + " Заказал книгу у " + supplier.name + " Игра Престолов");
    }
}
