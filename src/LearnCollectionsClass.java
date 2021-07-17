import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(12);
        list.add(53);
        list.add(60);
        list.add(80);
        list.add(25);
        list.add(12);

        // to get max and min element in any given collection
        System.out.println("Smallest element in List is : " + Collections.min(list));
        System.out.println("Largest element in List is : " + Collections.max(list));

        // to check the frequency of the element in any given collection
        System.out.println("Frequency of given element is : " + Collections.frequency(list, 12));

        // to sort a given list, ascending order by default.
        Collections.sort(list);
        System.out.println("Sorted List = " + list);

        // to sort a given list in descending order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Reverse Sorted List = " + list);

        // Sorting custom list
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sudarshan", 41));
        students.add(new Student("Nikhil", 30));
        students.add(new Student("Harsh", 21));
        students.add(new Student("Kaveri", 25));
        students.add(new Student("Sonakshi", 37));

        System.out.println("Original Student's List : " + students);
        // sorting custom list of Students
        Collections.sort(students);
        System.out.println("Sorted Student's List : " + students);

        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println("Sorted List using comparator by name : ");
        System.out.print(students);
    }
}
