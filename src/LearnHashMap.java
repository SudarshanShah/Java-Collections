import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

    public static void main(String[] args) {

        // Map is type of data structure that stores data in key-value pair format.
        // Any class can serve as a key, 'if and only if', it overrides the equals() and hashCode() method .
        // HashMap implements Map interface, in which order is not guaranteed.
        // When the number of entries in the hash table exceeds the product of the load factor and the current
        // capacity, the hash table is rehashed (that is, internal data structures are rebuilt)
        // so that the hash table has approximately twice the number of buckets.
        // time complexity for all operations is O(1).
        Map<String, Integer> numbers = new HashMap<>();
        // adding data to the map
        // It doesn't allow duplicate keys. Instead if we try to do that,
        // it updates the value of that corresponding duplicate key.
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        // accepts NULL as key
        numbers.put(null, 4);
        // overrides the value corresponding to the key if key already exists
        numbers.put("Two", 22);
        // prevents it to override value if key is already present
        numbers.putIfAbsent("Three", 33);
        numbers.put("Five", 5);
        numbers.put("Six", 6);

        System.out.println("HashMap 1.0 = " + numbers);

        // Iterating Map using Entry
        // Entry object stores in the bucket like this (hash,key,value,bucketindex) .
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println("HashMap data is : " + entry);
            System.out.println("Key is : " + entry.getKey());
            System.out.println("Value is : " + entry.getValue());
        }

        // Iterating only Keys in Map
        for (String key : numbers.keySet()) {
            System.out.println("Key only : " + key);
        }

        // Iterating only Values in Map
        for (Integer value : numbers.values()) {
            System.out.println("Value only : " + value);
        }

        // to check if a key is present
        System.out.println("Is given key present ? " + numbers.containsKey("One"));

        // to check if a value is present
        System.out.println("Is given value present ? " + numbers.containsValue(6));

        // to check if map is empty
        System.out.println("Is map empty ? " + numbers.isEmpty());
    }
}
