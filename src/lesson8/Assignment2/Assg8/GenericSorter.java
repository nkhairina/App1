package lesson8.Assignment2.Assg8;

public class GenericSorter<T extends Comparable<T>> {

    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1); // to call quicksort method
    }

    private void quickSort(T[] array, int low, int high) { // method quicksort
        if (low < high) { // This line checks if there are elements to sort (the starting index is less
                          // than the ending index)
            int pivotIndex = partition(array, low, high); // call pivot element and its position in the array
            quickSort(array, low, pivotIndex - 1); // method to sort the left subarray
            quickSort(array, pivotIndex + 1, high);// method to sort the right subarray
        }
    }

    private int partition(T[] array, int low, int high) {
        // called partition that takes the array, the starting index,
        // and the ending index as input and returns the pivot element's final position

        T pivot = array[high]; // choose last element as pivot
        int i = low - 1; // position of the element smaller than the pivot
        for (int j = low; j < high; j++) { // loop element
            if (array[j].compareTo(pivot) < 0) { // checks if the current element is less than the pivot.
                i++; // move a smaller element to the left.
                swap(array, i, j); // exchange the positions of the element at i and the current element (j)
            }
        }
        swap(array, i + 1, high); // swaps the pivot (array[high]) with the element at i + 1
        return i + 1;
    }
    // check elements to the left of the pivot are smaller

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j]; // swap with other element
        array[j] = temp;
    }
}
