import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

    public static void main(String[] args) {

        // Set is an data structure, which doesn't allow duplicate elements.
        // LinkedHashSet class implements Set interface in Linked list way, in which order of elements is guaranteed.
        Set<Integer> set = new LinkedHashSet<>();
        // adding elements in LinkedHashSet.
        // hashing occurs for each element
        // and each element has unique hash value.
        set.add(55);
        set.add(80);
        set.add(75);
        set.add(30);
        System.out.println("LinkedHashSet 1.0 = " + set);

        // removing element by specifying value
        set.remove(75);
        System.out.println("LinkedHashSet 2.0 = " + set);

        // to check if an element is present or not
        System.out.println("Is given element present ? " + set.contains(30));

        // to check if set is empty
        System.out.println("Is set empty ? " + set.isEmpty());

        // to get the size of the set
        System.out.println("Size of the LinkedHashSet is : " + set.size());
    }
}
