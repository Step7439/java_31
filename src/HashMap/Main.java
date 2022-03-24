package HashMap;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook<String, Contact> map = new PhoneBook<>();

        map.put("Рабочи телефон", new Contact("Pety", 56675));
        map.put("Изброные", new Contact<>("Oly", 45654));
        Contact info = map.get("Изброные");
        System.out.print(info.key + " ");
        System.out.println(info.value);

    }
}
