package javaLecture9;

public class Square extends Shape {
    // our based class says we should have startPosition, we implement the abstract
    // class in the inherited class, if you do not add override it means that u keep
    // the same abstract method than in the parent class. Override means use this
    // new method which is actually
    // instead of this. You are not overriding the implementation, u are overriding
    // the method

    Square(double startPosition, double side){
        super(startPosition);
        this.side = side
    }

    @override
    double calculateVolume() {

    }

    @override
    double findArea() {

    }

}
