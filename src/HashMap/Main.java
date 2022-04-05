package HashMap;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook map = new PhoneBook();

        map.addGroup("Изброные");
        map.addGroup("Рабочи телефон");
        map.addContact("Изброные", String.valueOf(new Contact("Pety","89992342115")));
        map.addContact("Рабочи телефон", String.valueOf(new Contact("Oly", "89992344317")));
        System.out.println(map.getСontacts("Изброные"));
        System.out.println(map.getСontactByName("Oly"));
    }
}
