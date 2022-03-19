package AbstractionsInterfaces;

public class UserLib extends User implements Librarian {

    public UserLib(String name, String worker, int age) {
        super(name, worker, age);
    }
    @Override
    public void librarian(Reader reader) {
        System.out.println(worker + " " + name + " Позвонил " + " и сказал о просрочиной книги " + reader.toString());
    }

}
