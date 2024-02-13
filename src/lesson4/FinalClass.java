package lesson4;

public class FinalClass {

    public final class Circle {
        private final double radius;
        private final double PI = 3.14159;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return PI * radius * radius;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(5);
            System.out.println("Area of the circle: " + circle.calculateArea());
        }
    }

}
