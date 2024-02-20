package lesson8.Assignment2.Assg8;

public class Main {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] array = { 5, 2, 9, 1, 6 };
        // Create an instance of GenericSorter for sorting integers
        GenericSorter<Integer> sorter = new GenericSorter<>();
        // Sort the array using the GenericSorter
        sorter.sort(array);
        // Print a message indicating that the array is sorted
        System.out.println("Sorted array:");
        // Iterate through the sorted array and print each element
        for (Integer num : array) {
            System.out.print(num + " ");
        }
    }
}
