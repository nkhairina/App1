package lesson8.Assignment2.Assg4;

import java.util.Comparator;

public class Maximizer<T> {
    public T max(T[] array, Comparator<T> comparator) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(array[i], max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = { 3, 7, 2, 9, 5 };
        Maximizer<Integer> intMaximizer = new Maximizer<>();
        int maxInt = intMaximizer.max(intArray, Comparator.naturalOrder());
        System.out.println("Max Integer: " + maxInt);

        String[] stringArray = { "apple", "banana", "orange", "grape" };
        Maximizer<String> stringMaximizer = new Maximizer<>();
        String maxString = stringMaximizer.max(stringArray, Comparator.naturalOrder());
        System.out.println("Max String: " + maxString);

        Double[] doubleArray = { 3.14, 2.71, 1.618 };
        Maximizer<Double> doubleMaximizer = new Maximizer<>();
        double maxDouble = doubleMaximizer.max(doubleArray, Comparator.naturalOrder());
        System.out.println("Max Double: " + maxDouble);
    }
}
