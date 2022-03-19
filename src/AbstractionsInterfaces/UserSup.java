package AbstractionsInterfaces;

public class UserSup extends User implements Supplier{
    public UserSup(String name, String worker, int age) {
        super(name, worker, age);
    }
    @Override
    public void customers(Reader reader) {
        System.out.println(worker + " " + name + " Обещал привизти книгу  " + reader.toString() + " <Игра Престолов>");
    }
}
