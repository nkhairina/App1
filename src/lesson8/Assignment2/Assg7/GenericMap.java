package lesson8.Assignment2.Assg7;

import java.util.HashMap;
import java.util.Map;

public class GenericMap<K, V> {
    private Map<K, V> map;

    public GenericMap() {
        map = new HashMap<>();
    }

    // Method to add a key-value pair to the map
    public void put(K key, V value) {
        map.put(key, value);
    }

    // Method to retrieve the value associated with a given key
    public V get(K key) {
        return map.get(key);
    }

    // Method to check if a key exists in the map
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    // Method to remove a key-value pair from the map
    public void remove(K key) {
        map.remove(key);
    }

}
