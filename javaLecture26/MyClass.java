public class MyClass {
    public static void main(String[] args) {
        Voiture tesla = new Voiture();
        tesla.start();

    }
}

class Voiture {
    void start() {
        System.out.println("VROOOOOM");
    }

}