package AbstractionsInterfaces;

public class UserRed extends User implements Reader{

    public UserRed(String name, String worker, int age) {
        super(name, worker, age);
    }

    @Override
    public void readers(Administrator administrator) {
        if (age >= 18) {
            System.out.println(worker + " " + name + " заказал книгу эротического характера  ");
        }else {
            System.out.println(name + " Вам мало лет ! C уважением Администратор " + administrator.toString());
        }
    }

}
