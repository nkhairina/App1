package lesson2.operators.exec1;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        getFibonacciSeq(num);
        sc.close();

    }

    static void getFibonacciSeq(int _num) {

        int limit = _num;
        int first = 0;
        int second = 1;

        System.out.printf("%d, ", first);
        System.out.printf("%d, ", second);

        int current = first + second;

        while (current < limit) {

            System.out.printf("%d, ", current);
            first = second;
            second = current;
            current = first + second;

        }

    }

}