package lesson4;

// Declare an abstract class named Shape, which cannot be instantiated directly
public abstract class Shape {

    // Declare an abstract method named calculateArea that returns a double value
    // Subclasses must implement this method to provide specific area calculations
    public abstract double calculateArea();
}

// Declare a class named Rectangle that extends the Shape class
class Rectangle extends Shape {
    // Private fields to store the length and width of the rectangle
    private double length;
    private double width;

    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the calculateArea method from the Shape class to provide the
    // area calculation for rectangles (length * width)
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Declare a class named Circle that also extends the Shape class
class Circle extends Shape {
    // Private field to store the radius of the circle
    private double radius;

    // Private static constant to store the value of PI
    private static final double PI = 3.14159;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method from the Shape class to provide the
    // area calculation for circles (PI * radius * radius)
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}

// Declare the Main class with the main method, the entry point of the program
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
