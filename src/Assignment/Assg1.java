package Assignment;

public class Assg1 {

    public static void main(String[] args) {
        // Declare and initialize variables of different data types
        int integerNumber = 10;
        double doubleNumber = 3.14;
        boolean boolValue = true;
        char charValue = 'A';
        String stringValue = "Hello, World!";

        // Print the values of the variables to demonstrate their usage
        System.out.println("Integer value: " + integerNumber);
        System.out.println("Double value: " + doubleNumber);
        System.out.println("Boolean value: " + boolValue);
        System.out.println("Character value: " + charValue);
        System.out.println("String value: " + stringValue);

        // Access and print command-line arguments (if any)
        if (args.length > 0) {
            System.out.println("\nYou passed the following arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}