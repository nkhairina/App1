package lesson11;

import java.util.Arrays;

public class Assg_lambda {
    public static void main(String[] args) {
        // Create an array of strings
        String[] strings = { "banana", "apple", "orange", "grape", "kiwi" };

        // Print the original array
        System.out.println("Original array:");
        printArray(strings);

        // Sort the array in ascending order based on string length using lambda
        // expression
        Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());

        // Print the sorted array
        System.out.println("\nSorted array in ascending order based on string length:");
        printArray(strings);
    }

    // Method to print the array of strings
    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
