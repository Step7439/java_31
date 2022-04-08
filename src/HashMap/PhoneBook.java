package HashMap;

import java.util.*;

public class PhoneBook {
    HashMap<String, List<Contact>> map = new HashMap<>();

    // метод создания группы
    void addGroup(String group) {
        map.put(group, new ArrayList<>());
    }

    // метод добавления контакта
    void addContact(Contact contact, String[] grupe) {
        for (String grups : grupe) {
            if (!map.containsKey(grups)) {
                System.out.println("Такой группы нет");
            }
            List<Contact> contactGrup = map.get(grups);
            contactGrup.add(contact);
        }
    }

    // метод получения контактов по группе
    public List<Contact> findContactsInGroup(String group){
        List<Contact> all = new ArrayList<>();
        List<Contact> contactsInGroup = map.get(group);
        for (int i = 0; i < contactsInGroup.size(); i++) {
            Contact allContacts = contactsInGroup.get(i);
            all.add(allContacts);
        }
        return all;
    }

//     метод получения контакта по имени
    List<String> getСontactByName(String name){
        List<String> result = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()){
            //System.out.println(entry.getValue());
            if (entry.setValue(name) == name){
                System.out.println(entry.getValue());
            }
        }
        return result;
    }

//     метод получения контакта по номеру
public Contact getСontactByPhone(String number) {
    Contact contact1 = null;
    for (Map.Entry<String, List<Contact>> allMap : map.entrySet())
        for (Contact contact : allMap.getValue())
            if (contact.getNumber().equals(number)) {
                contact1 = contact;

            }
    return contact1;
}

}

