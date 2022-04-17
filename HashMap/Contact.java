package HashMap;

import java.util.List;
import java.util.Objects;

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
    public void setName(String name){
        this.name = name;
    }

    public String  getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return "Имя " + name + " - " + "номер " + number;
    }
    @Override
    public boolean equals(Object obj) {
        Contact compContact = (Contact) obj;
        return this.number.equals(compContact.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
