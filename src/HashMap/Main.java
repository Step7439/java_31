package HashMap;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook contacts = new PhoneBook();
        Contact contact1 = new Contact("Pety","89992342115");
        Contact contact2 = new Contact("Oly", "89992344317");

        contacts.addGroup("Рабочая");
        contacts.addGroup("Друзья");
        contacts.addGroup("Изброная");

        String[] grupe = {"Рабочая","Друзья","Изброная"};

        contacts.addContact(contact1,grupe);
        contacts.addContact(contact2,grupe);

        Contact contact3 = contacts.getСontactByPhone("89992342115");
        System.out.println(contact3);

        List<Contact> contact4 = contacts.findContactsInGroup("Рабочая");
        System.out.println(contact4);

        Contact contact5 = contacts.getСontactByName("Oly");
        System.out.println(contact5);
    }
}
