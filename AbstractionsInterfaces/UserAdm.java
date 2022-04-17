package AbstractionsInterfaces;

public class UserAdm extends User implements Administrator{
    public UserAdm(String name, String worker, int age) {
        super(name, worker, age);
    }

    @Override
    public void overdueNotification(Librarian librarian) {
        System.out.println(worker + " " + name + " сообщил " + " что заканчиваются книги! Библиотекарю " + librarian.toString());
    }
}
