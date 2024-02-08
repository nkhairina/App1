package lesson3;

import java.util.Arrays;

public class RandomArray {

    public static void main(String[] args) {
        int len = 5; // variable stores length random array (10 elements).
        int min = 5; // stores the minimum of element
        int max = 10; // stores the max

        int[] randoms = genRandomIntArray(len, min, max); // call the generate the random element
        System.out.println(Arrays.toString(randoms));
    }

    public static int[] genRandomIntArray( // fx generate random element
            int length, int min, int max) {
        int[] a = new int[length];
        for (int i = 0; i < length; i++) { // loop all random elements
            a[i] = (int) Math.round(Math.random() * (max - min) + min);
        }
        return a;
    }
}

// Math.random() = generate value between 0 and 1 etc 0.123, 0.789, 0.99999,
// (max - min) = calc range between max and min
// Math.random() * (max - min) = to check the random fit the range
// * random number was 0.789 and the range is 5, this would become 0.789 * 5 =
// 3.945
// + min = shifting it down to start from the minimum value,3.945 + 5 = 8.945
// Math.round() = function rounds the number