package lesson2.operators.exec1;

public class Q2 {

    public static void main(String[] args) {
        // Test cases for question 2
        testCase2(true, true);
        testCase2(true, false);
        testCase2(false, true);
        testCase2(false, false);
    }

    // Method to execute test cases for question 2
    public static void testCase2(boolean p, boolean q) {
        if (p && q) {
            System.out.println("true");
        } else {
            if (!q) {
                System.out.println("false");
            } else {
                if (p && q) {
                    System.out.println("pliq");
                } else {
                    System.out.println("q");
                }
            }
            System.out.println(p);
        }
        System.out.println(); // Add a newline for clarity
    }
}
