package lesson8.Assignment1.Assg1;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle("red", true, 5.0);
        Rectangle rectangle = new Rectangle("blue", false, 4.0, 6.0);
        Square square = new Square("green", true, 4.0);

        System.out.println("Circle: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\nRectangle: " + rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nSquare: " + square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
