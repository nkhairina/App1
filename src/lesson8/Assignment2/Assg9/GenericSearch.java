package lesson8.Assignment2.Assg9;

public class GenericSearch<T extends Comparable<T>> {

    // Linear search method
    public int linearSearch(T[] array, T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(key) == 0) {
                return i; // Return the index of the key if found
            }
        }
        return -1; // Return -1 if key is not found
    }

    // Binary search method
    public int binarySearch(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = array[mid].compareTo(key);

            if (cmp == 0) {
                return mid; // Return the index of the key if found
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Return -1 if key is not found
    }

}
