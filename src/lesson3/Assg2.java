package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Assg2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the maximum number of values: ");
        int maxValues = scanner.nextInt();
        System.out.print("Enter the minimum number: ");
        int minNumber = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();

        // Validate input
        if (maxValues <= 0 || minNumber >= maxNumber) {
            System.err.println(
                    "Invalid input. Please enter positive values for maxValues and maxNumber greater than minNumber.");
            return;
        }

        // Generate random numbers and store them in an array
        int[] numbers = generateRandomNumbers(maxValues, minNumber, maxNumber);

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Calculate and display statistics
        double mean = calculateMean(numbers);
        int median = findMedian(numbers);
        int mod = numbers[numbers.length % 2 == 0 ? numbers.length / 2 - 1 : numbers.length / 2];

        System.out.println("\nSorted array: " + Arrays.toString(numbers));
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mod: " + mod);
    }

    // Generate an array of random numbers with specified limits
    private static int[] generateRandomNumbers(int maxValues, int minNumber, int maxNumber) {
        int[] numbers = new int[maxValues];
        for (int i = 0; i < maxValues; i++) {
            numbers[i] = (int) (Math.random() * (maxNumber - minNumber + 1)) + minNumber;
        }
        return numbers;
    }

    // Calculate the mean of the array
    private static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    // Find the median of the array
    private static int findMedian(int[] numbers) {
        if (numbers.length % 2 == 0) {
            return (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2;
        } else {
            return numbers[numbers.length / 2];
        }
    }
}
