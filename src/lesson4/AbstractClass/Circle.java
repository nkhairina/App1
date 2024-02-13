package lesson4.AbstractClass;

// Declare a class named Circle that also extends the Shape class
public class Circle extends Shape {
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
