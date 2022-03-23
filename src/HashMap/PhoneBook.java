package HashMap;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook<K, V> {
    List<Contact<K, V>> grup = new ArrayList<>();

    public void put(K key, V value) {
        for (Contact<K, V> kv : grup) {
            if (kv.getKey().equals(key)) {
                kv.setVolue(value);
                return;
            }
        }
        Contact<K, V> newKv = new Contact<>(key, value);
        grup.add(newKv);
    }

    public V get(K key) {
        for (Contact<K, V> kv : grup) {
            if (kv.getKey().equals(key)) {
                return kv.getVolue();
            }
        }
        return null;
    }
}
