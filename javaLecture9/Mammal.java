package javaLecture9;

public class Mammal {
    private int numberOfEyes;

    public Mammal(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    private void closeEye() {
        System.out.println("Eyes closed");
    }
}
