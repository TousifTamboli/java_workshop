class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {  // Overriding the method
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {  // Overriding the method
        System.out.println("Cat meows");
    }
}


//syntax for creating objects changes in Run Time Polymorphism
//Classname objectName;
//objectName = new subClassName()
//objectName.methodName

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal a1; // Reference of parent class
        
        a1 = new Dog(); // Dog object assigned to parent class reference
        a1.makeSound(); // Output: Dog barks

        a1 = new Cat(); // Cat object assigned to parent class reference
        a1.makeSound(); // Output: Cat meows
    }
}
