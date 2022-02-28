package AbstractionsInterfaces;

public class Main {
    public static void main(String[] args) {
        Pety reader = new Pety("Pety","Reader");
        reader.readers();
        Vasay supplier = new Vasay("Vasay", "Supplier");
        supplier.customers(supplier);
        Tolik librarian = new Tolik("Tolik", "Librarian");
        librarian.librarian();
        Dima administrator = new Dima("Dima","Administrator");
        administrator.overdueNotification();
        reader.customers(supplier);
    }
}
