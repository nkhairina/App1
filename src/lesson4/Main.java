package lesson4;

public class Main {

    public class Main {
        // The main method, where program execution begins
        public static void main(String[] args) {
            // Create a Rectangle object with length 5 and width 4
            Rectangle rectangle = new Rectangle(5, 4);

            // Create a Circle object with radius 3
            Circle circle = new Circle(3);

            // Print the calculated area of the rectangle to the console
            System.out.println("Area of rectangle: " + rectangle.calculateArea());

            // Print the calculated area of the circle to the console
            System.out.println("Area of circle: " + circle.calculateArea());
        }
    }

}
