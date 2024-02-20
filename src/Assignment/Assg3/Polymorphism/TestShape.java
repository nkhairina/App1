package Assignment.Assg3.Polymorphism;

public class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(2);

        Shape[] shapes = { rectangle, circle };

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.area());
        }
    }
}
