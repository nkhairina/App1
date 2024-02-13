package lesson4;

public class StaticClass {

    public class MathUtils {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static boolean isEven(int num) {
            return num % 2 == 0;
        }
    }

    public class Main {
        public static void main(String[] args) {
            System.out.println("Result of adding 10 and 5: " + MathUtils.add(10, 5));
            System.out.println("Result of subtracting 8 from 15: " + MathUtils.subtract(15, 8));

            int number = 17;
            if (MathUtils.isEven(number))
                System.out.println(number + " is even.");
            else
                System.out.println(number + " is odd.");
        }
    }

}
