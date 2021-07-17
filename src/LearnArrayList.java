import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        // All insertions and removal in list is O(n).
        List<Integer> list = new ArrayList<>();
        // adding elements to list
        list.add(10);
        list.add(21);
        list.add(35);
        System.out.println("list = " + list);

        // adding new element gets at end
        list.add(45);
        System.out.println("list = " + list);

        // adding elements at particular index
        list.add(2, 71);
        System.out.println("list = " + list);

        List<Integer> newList = new ArrayList<>();
        newList.add(50);
        // adding list to another list, but of same data type
        newList.addAll(list);
        System.out.println("newList = " + newList);

        // getting particular element from list by passing index
        System.out.println("getting element from newList using get() method = " + newList.get(3));

        // removing element from the list by passing index
        newList.remove(2);
        System.out.println("newList after removing element at index 2 = " + newList);

        // removing element from the list by passing particular value
        newList.remove(Integer.valueOf(10));
        System.out.println("newList after removing element 10 = " + newList);

        // to remove all elements in the list
        list.clear();
        System.out.println("list after clear() method = " + list);

        // update value in list using set() method at particular index
        // time complexity - O(1)
        newList.set(1, 80);
        System.out.println("newList = " + newList);

        // to check if an element is present in the list
        // time complexity - O(n)
        System.out.println("is the given element present in newList ? " + newList.contains(50));


        // Traversing list using simple for-loop
        for (int i = 0; i < newList.size(); i++) {
            System.out.println("element in list at index "+i+" = " + newList.get(i));
        }

        // Traversing list using for-each loop
        for (Integer element : newList) {
            System.out.println("for-each element in list = " + element);
        }

        // Traversing list using Iterator
        Iterator<Integer> it = newList.iterator();
        while (it.hasNext()) {
            System.out.println("element in list using iterator : " + it.next());
        }
    }
}
