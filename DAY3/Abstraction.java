abstract class Vehicle {
    abstract void start(); // Abstract method (no body)

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        Car c1 = new Car();
        c1.start();
        c1.stop();
    }
}
