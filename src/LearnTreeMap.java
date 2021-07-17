import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {

    public static void main(String[] args) {

        // Map is type of data structure that stores data in key-value pair format.
        // TreeMap implements Map interface, in which it sorts key.
        // it is not synchronized.
        // It implements Red-Black tree data structure, which is self-balancing binary search tree.
        // time complexity of all operations is O(log n).
        Map<String, Integer> numbers = new TreeMap<>();
        // adding data to the map
        // It doesn't allow duplicate keys. Instead if we try to do that,
        // it updates the value of that corresponding duplicate key.
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        // does not accepts NULL as key or NULL values.
        //numbers.put(null, 4); -> if NULL passed as key, it throws NullPointerException.
        // overrides the value corresponding to the key if key already exists
        numbers.put("Two", 22);
        // prevents it to override value if key is already present
        numbers.putIfAbsent("Three", 33);
        numbers.put("Five", 5);
        numbers.put("Six", 6);

        System.out.println("TreeMap 1.0 = " + numbers);

        // Iterating Map using Entry
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println("TreeMap data is : " + entry);
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
