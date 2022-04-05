package HashMap;

import java.util.*;

public class PhoneBook {
    HashMap<String, String> map = new HashMap<>();

    // метод создания группы
    void addGroup(String group){
        map.put(group,null);
    }
    // метод добавления контакта
    void addContact(String grupe,String contact){
        map.put(grupe,contact);
    }

    // метод получения контактов по группе
    String getСontacts(String group){
       return map.get(group);
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

//    // метод получения контакта по номеру
//    Contact getСontactByPhone(String phone);

}

