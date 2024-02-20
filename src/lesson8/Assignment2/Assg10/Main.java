package lesson8.Assignment2.Assg10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Test the Algorithm class with different data types and operations
        Algorithm<Integer> intAlgorithm = new Algorithm<>();

        // Test sorting algorithm
        Integer[] intArray = { 5, 2, 9, 1, 6 };
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        intAlgorithm.sort(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        // Test searching algorithm
        Integer intKey = 6;
        int intIndex = intAlgorithm.search(intArray, intKey);
        System.out.println("Index of key " + intKey + " in the sorted array: " + intIndex);

        // Test graph traversal algorithm (placeholder)
        // Assuming Graph<T> class is defined
        // Algorithm<String> stringAlgorithm = new Algorithm<>();
        // Graph<String> graph = new Graph<>();
        // stringAlgorithm.traverseGraph(graph);
    }
}
