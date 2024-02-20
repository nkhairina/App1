package lesson8.Assignment2.Assg9;

public class Main {

    public static void main(String[] args) {
        // Test the GenericSearch class with different data types and search criteria
        GenericSearch<Integer> intSearch = new GenericSearch<>();
        Integer[] intArray = { 1, 3, 5, 7, 9 };
        int intKey = 5;
        int intIndexLinear = intSearch.linearSearch(intArray, intKey);
        int intIndexBinary = intSearch.binarySearch(intArray, intKey);
        System.out.println("Integer Linear Search Result: " + intIndexLinear); // Output: 2
        System.out.println("Integer Binary Search Result: " + intIndexBinary); // Output: 2

        GenericSearch<String> stringSearch = new GenericSearch<>();
        String[] stringArray = { "apple", "banana", "orange", "pear", "strawberry" };
        String stringKey = "orange";
        int stringIndexLinear = stringSearch.linearSearch(stringArray, stringKey);
        int stringIndexBinary = stringSearch.binarySearch(stringArray, stringKey);
        System.out.println("String Linear Search Result: " + stringIndexLinear); // Output: 2
        System.out.println("String Binary Search Result: " + stringIndexBinary); // Output: 2
    }
}
