package ClassStructure;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Изучаем Java",605, 5);
        Book book2 = new Book("Философия Java",1164, 4 );
        Auhtor auhtor1 = new Auhtor("Кэти Сьерра, Берт Бейтс", 2012, book1);
        Auhtor auhtor2 = new Auhtor("Брюс Эккель",2019, book2);
        User user1 = new User("Джим","Керй","djimkeri@mail.ru");
        User user2 = new User("Иосиф","Сталин","stalin@mail.ru");
        User user3 = new User("Юрий","Гагарин","gagarin@mail.ru");

        book1.toString();
        auhtor1.toString();
        System.out.println();

        book2.toString();
        auhtor2.toString();
        System.out.println();

        Book.bookScore();
        System.out.println();
        System.out.println("Максимальный ретинг: " + Book.maxRetings);
        System.out.printf("Онлайн пользовотилей: " + User.totalOnline);

    }
}
