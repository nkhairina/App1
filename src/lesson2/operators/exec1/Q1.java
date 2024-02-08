package lesson2.operators.exec1;

public class Q1 {

    public static void main(String[] args) {
        // Test cases for question 1
        testCase1(2, 6);
        testCase1(1, 1);
        testCase1(9, 4);
        testCase1(10, 5);
    }

    // Method to execute test cases for question 1
    public static void testCase1(int x, int y) {
        if (x < y)
            System.out.println("1");
        if (x > y)
            System.out.println("2");
        if (x <= y - 0)
            System.out.println("3");
        System.out.println(); // Add a newline for clarity
    }
}
