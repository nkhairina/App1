package lesson2.operators.exec1;

import java.util.Scanner;

public class FlowStatement2 {

    public static void main(String[] args) {

        int i;
        int n;
        int nFact;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value n:");
        n = scanner.nextInt();
        scanner.close();

        i = 1;
        nFact = 1;

        while (i <= n) {
            nFact *= i;
            i += 1;
        }

        System.out.printf("n! = %d", nFact);

    }

}
