import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

    public static void main(String[] args) {

        // Set is an data structure, which doesn't allow duplicate elements.
        // HashSet class implements Set interface, in which order of elements is not guaranteed.
        // time complexity of all operations is O(n).
        Set<Integer> set = new HashSet<>();
        // adding elements in HashSet.
        // hashing occurs for each element
        // and each element has unique hash value.
        set.add(55);
        set.add(80);
        set.add(75);
        set.add(30);
        System.out.println("HashSet 1.0 = " + set);

        // removing element by specifying value
        set.remove(75);
        System.out.println("HashSet 2.0 = " + set);

        // to check if an element is present or not
        System.out.println("Is given element present ? " + set.contains(30));

        // to check if set is empty
        System.out.println("Is set empty ? " + set.isEmpty());

        // to get the size of the set
        System.out.println("Size of the HashSet is : " + set.size());
    }
}
