package javaLecture9;

public class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double startPosition, double length, double width) {
        super(startPosition);
        this.width = width;
        this.length = length;
    }
}
