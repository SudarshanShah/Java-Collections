import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {

        // Set is an data structure, which doesn't allow duplicate elements.
        // TreeSet class implements Set interface and like Binary Search Tree, in which elements are in sorted order.
        // time complexity of all operations is O(log n).
        Set<Integer> set = new TreeSet<>();
        // adding elements in TreeSet.
        // hashing occurs for each element
        // and each element has unique hash value.
        set.add(55);
        set.add(80);
        set.add(75);
        set.add(30);
        System.out.println("TreeSet 1.0 = " + set);

        // removing element by specifying value
        set.remove(75);
        System.out.println("TreeSet 2.0 = " + set);

        // to check if an element is present or not
        System.out.println("Is given element present ? " + set.contains(30));

        // to check if set is empty
        System.out.println("Is set empty ? " + set.isEmpty());

        // to get the size of the set
        System.out.println("Size of the TreeSet is : " + set.size());
    }
}
