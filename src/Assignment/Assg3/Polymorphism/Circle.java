package Assignment.Assg3.Polymorphism;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * radius * radius;
        return Math.round(area);
    }
}
