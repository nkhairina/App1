package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assg2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize list for the randomly generated sorted sequence of numbers
        ArrayList<Integer> arrNum = new ArrayList<>();

        // Get start, end and array length
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.print("Enter output count: ");
        int len = sc.nextInt();

        sc.close();

        // genArr invoked to create the number sequence
        genArr(start, end, len, arrNum);

        System.out.println("Generated number: " + arrNum.toString());
        System.out.printf("Mean: %.2f\n", getMean(arrNum));
        System.out.printf("Median: %.2f\n", getMedian(arrNum));
        System.out.println("Mode: " + getMode(arrNum));

    }

    public static double getMean(ArrayList<Integer> numArr) {

        int total = 0;

        for (int num : numArr) {

            total += num;

        }

        return (double) (total) / (double) (numArr.size());

    }

    public static double getMedian(ArrayList<Integer> numArr) {

        double res;

        if (numArr.size() % 2 == 0) {

            int firstMiddleIdx = numArr.size() / 2 - 1;
            int secondMiddleIdx = numArr.size() / 2;

            res = ((double) ((numArr.get(firstMiddleIdx) + numArr.get(secondMiddleIdx)))) / 2;

            return res;

        } else {

            int middleIdx = numArr.size() / 2;
            res = numArr.get(middleIdx);

            return res;
        }

    }

    public static int getMode(ArrayList<Integer> numArr) {

        // create a hashmap for all number frequency
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        int maxFrequency = 0;
        int mode = 0;

        // [1,1,1,2]
        // {{1,3}{2,1}}

        // iterate through all element in numArr
        for (int num : numArr) {

            // update frequency for each num
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;

            // put the new frequency into the hashmap
            frequencyMap.put(num, frequency);

            // compare current num frequency with the existing maxFrequency
            // if the current frequency is higher than the maxFrequency
            // the current frequency value will be assigned to maxFrequency
            // and assign the mode value with the new maxFrequency key (which is the num)
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }

        }

        return mode;

    }

    public static void genArr(int start, int end, int len, ArrayList<Integer> numArr) {

        for (int i = 0; i < len; i++) {

            // justification
            // Math.random() will generate a number within (0 - 1). eg. 0.624...
            // (end - start) to get biggest number to be multiply by the generated value to
            // get results that falls within the range.
            // (+1) to make the "end" value achievable, without it the max result will be
            // (end - 1).
            // (+start) to ensure the result minimum value to "start" value.
            numArr.add((int) (Math.random() * (end - start + 1) + start));

        }

        numArr.sort(null);
    }

}
