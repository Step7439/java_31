package AbstractionsInterfaces;

public class User implements Administrator,Librarian,Reader,Supplier{
    String name;
    String worker;
    public User(String name,String worker){
        this.name = name;
        this.worker = worker;
    }
    @Override
    public void overdueNotification(User librarian) {
        System.out.println(worker + " " + name + " сообщил " + librarian.name + " что заканчиваются книги! ");
    }

    @Override
    public void librarian() {
        System.out.println(worker + " " + name + " заказывает книги.");
    }

    @Override
    public void readers() {
        System.out.println(worker + " " + name + " берет и возвращает книги.");
    }

    @Override
    public void customers(User supplier) {
        System.out.println();
        System.out.println(worker + " " + name + " Заказал книгу у " + supplier.name + " Игра Престолов");
    }

}