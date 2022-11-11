public class Dog {
    String name = "";
    int age = 0;

    // A constructor is a method that has the same name as the class
    Dog(String name) {
        this.name = name;
    }

    static void bark() {
        System.out.println("Barking");
    }

    void run() {
        System.out.println("Run");
    }

}
