import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10};
        // binary search algorithm to search for an element, if it's present in the given array.
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of given element is : " + index);

        int[] nums = {21, 34, 10, 4, 6, 7, 25, 76, 98, 56, 31, 45, 69, 80};
        // sorting the array, ascending order by default.
        Arrays.sort(nums);

        System.out.print("Sorted Array nums : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] n = new int[10];
        // to fill array with any value
        Arrays.fill(n, 100);
        System.out.print("Filled Array n : ");
        for (int i : n)
            System.out.print(i + " ");
    }
}
