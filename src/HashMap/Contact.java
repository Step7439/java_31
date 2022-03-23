package HashMap;

public class Contact<K, V> {
    protected K key;
    protected V value;

    public Contact(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getVolue() {
        return value;
    }

    public void setVolue(V value) {
        this.value = value;
    }

    public K toString(K key) {
        return key;
    }
}
