package AbstractionsInterfaces;

public class Main {
    public static void main(String[] args) {
        User reader = new User("Pety","Reader");
        User supplier = new User("Vasay", "Supplier");
        User librarian = new User("Tolik", "Librarian");
        User administrator = new User("Dima","Administrator");

        reader.customers(supplier);
        administrator.overdueNotification(librarian);
    }
}
