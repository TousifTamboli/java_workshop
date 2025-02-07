//abstraction means a thought that is been defined somewhere we don't need to show it to user

abstract class Vehicle {
    abstract void start(); // Abstract method (no body) it is a thought we just defined it

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}

// Why extends Vehicle?
// Car inherits from Vehicle and must implement start() because Vehicle declared it as abstract.
// Why is start() defined here?
// Since Vehicle only declared start() but didn't define it, Car must provide an implementation.

public class Abstraction {
    public static void main(String args[]) {
        Car c1 = new Car();
        c1.start();
        c1.stop();
    }
}
