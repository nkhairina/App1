package lesson2.operators.exec1;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        String str = sc.nextLine();
        System.out.print("Enter your last value to sum: ");
        sc.close();

        // Call switchCase method to convert day abbreviations
        String day = switchCase(str);
        System.out.println("Full day name: " + day);
    }

    static String switchCase(String day) {
        String ret = "";

        switch (day.toLowerCase()) {
            case "m":
            case "mon":
            case "md":
                if (day.contains("md")) {
                    ret = "Day Monday";
                } else
                    ret = "Monday";
                break;

            case "tu":
                ret = "Tuesday";
                break;

            case "w":
                ret = "Wednesday";
                break;

            case "th":
                ret = "Thursday";
                break;

            case "fr":
                ret = "Friday";
                break;
            default:
                ret = "Invalid input";
                break;
        }

        return ret;
    }
}
