package lesson4.AbstractClass;

// Declare a class named Rectangle that extends the Shape class
public class Rectangle extends Shape {
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
