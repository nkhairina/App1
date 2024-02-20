package Assignment.Assg3.Polymorphism;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        double area = length * width;
        return Math.round(area);
    }
}
