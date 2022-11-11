package javaLecture9;

public class Cattle extends Mammal {

    // because the parent class has a constructor, we are obliged to create a constructor here
    public Cattle(int numberOfLegs){
        super(numberOfLegs) // when u see super, it refers to the parent Class
    }

}
