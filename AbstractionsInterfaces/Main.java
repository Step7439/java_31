package AbstractionsInterfaces;

public class Main {
    public static void main(String[] args) {
        UserRed reader = new UserRed("Петя","Читатель", 17);
        UserRed reader1 = new UserRed("Жорик","Читатель", 25);
        UserSup supplier = new UserSup("Вася", "Поставщик книг", 44);
        UserLib librarian = new UserLib("Толик", "Библиотекарь", 32);
        UserAdm administrator = new UserAdm("Дима","Администратор", 45);

        reader.readers(administrator);
        administrator.overdueNotification(librarian);
        reader1.readers(administrator);
        librarian.librarian(reader);
        supplier.customers(reader1);
    }
}
