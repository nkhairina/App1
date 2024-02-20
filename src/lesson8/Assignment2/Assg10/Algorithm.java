package lesson8.Assignment2.Assg10;

import java.util.Arrays;

public class Algorithm<T extends Comparable<T>> {

    // Method to execute a sorting algorithm on the input array
    public void sort(T[] input) {
        Arrays.sort(input);
    }

    // Method to execute a searching algorithm (linear search) on the input array
    public int search(T[] input, T key) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].compareTo(key) == 0) {
                return i; // Return the index of the key if found
            }
        }
        return -1; // Return -1 if key is not found
    }

    // Method to execute a graph traversal algorithm (e.g., depth-first search) on
    // the input graph
    // This is just a placeholder method, you would implement your specific graph
    // traversal algorithm here
    public void traverseGraph(Graph<T> graph) {
        // Implementation of the graph traversal algorithm
    }

    // Additional methods for different algorithmic operations can be added here
}
