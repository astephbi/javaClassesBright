package javaLecture9;

abstract public class Shape {
    // abstract class can't be implemented, we can not create a new instance, we
    // don't need to know what kind of shape
    // it is to move it. You can inherit abstract, bcoz there is something u can
    // make use of
    // a class becomes abstract if it has only one abstract method
    // abstraction make it compulsory to instance some

    private double height;
    private double startPosition;

    Shape(double height, double startPosition) {
        this.position = startPosition;
    }

    abstract double calculateVolume();

    abstract double findArea();

    void move(double nextLocation) {
        System.out.println("Moved from" + startPosition + "to" + nextLocation);
    }

}
