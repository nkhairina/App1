package lesson8.Assignment1.Assg1;

public class Square extends Rectangle {
    private double sideLength;

    public Square(String color, boolean filled, double sideLength) {
        super(color, filled, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square (side length=" + sideLength + ", color=" + color + ", filled=" + filled + ")";
    }
}