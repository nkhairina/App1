package lesson3;

import java.util.Arrays;

public class SelectionSort {

    double[] arr1 = new double[] { 8.0, -2.5, -5.0, 1.0, 9.0 };

    public static void main(String[] args) {
        // Call the selectionSort method here
        double[] arr = { 8.0, -2.5, -5.0, 1.0, 9.0 };
        selectionSort(arr, true);

        // Print the sorted array
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(double[] d, boolean inc) {
        int idxToSwap;
        double temp;

        // d.length - 1 because in findMinIdx/findMaxIdx is will require to check one
        // index in front of the pass index
        // if the index that we pass is d.length - 1, the starting index we pointed to
        // in both other method will be d.length
        // ArrayOutOfBoundException will be called in those method
        for (int i = 0; i < (d.length - 1); i++) {
            int k = i;

            // determine whether increment or decrement
            if (inc) {
                idxToSwap = findMinIdx(d, k);
            } else {
                idxToSwap = findMaxIdx(d, k);
            }

            // index swapping value
            temp = d[idxToSwap];
            d[idxToSwap] = d[k];
            d[k] = temp;
        }
    }

    public static int findMinIdx(double[] d, int k) {
        int minIdx = k;
        // i = k + 1 to make sure the current index we pointing to is one index in front
        // of the minIdx
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] < d[minIdx]) {
                minIdx = i;
            }
        }
        // return smallest index
        return minIdx;
    }

    public static int findMaxIdx(double[] d, int k) {
        int maxIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] > d[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}