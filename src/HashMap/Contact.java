package HashMap;

import java.util.List;

public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String  getNumber() {
        return number;
    }

    public String toString() {
        return name + " - " + number;
    }
}
