package lesson2.operators.exec1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        getPrimeNumber(start, end);
        sc.close();

    }

    private static void getPrimeNumber(int _start, int _end) {

        int start = _start;
        int end = _end;

        for (int i = start; i <= end; i++) {

            if (isPrimeNumber(i)) {
                System.out.printf("%d, ", i);
            }
        }

    }

    private static boolean isPrimeNumber(int _num) {

        int num = _num;
        boolean res = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

}