package lesson3;

public class SequenceSearch {

    public static void main(String[] args) {
        int[] a = { 3, 5, 6, 1, 8 }; // Replace with your actual array
        int k = 6; // Replace with the value you want to search for

        int i = 0;
        boolean found = false;

        while (i < a.length && !found) {
            if (a[i] == k) {
                found = true;
            } else {
                i++;
            }
        }

        if (!found) { // Check if value is not found after loop
            i = -1; // Assign -1 to i if not found
        }

        if (found) {
            System.out.println("Value " + k + " is found at index " + i);
        } else {
            System.out.println("Value " + k + " is not found in the array");
        }

    }

}