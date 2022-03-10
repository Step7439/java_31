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
    public void librarian(User reader) {
        System.out.println(worker + " " + name + " Позвонил " + reader.name + " и сказал о просрочиной книге");
    }

    @Override
    public void readers(User administrator) {
        System.out.println(worker + " " + name + " заказал книгу у " + administrator.worker + administrator.name);
    }

    @Override
    public void customers(User supplier) {
        System.out.println();
        System.out.println(worker + " " + name + " Заказал книгу у " + supplier.name + " Игра Престолов");
    }

}