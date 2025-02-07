//This is also type of abstraction using interfaces
//Interfaces is Pure Abstraction
//implements - keyword (like extend in inhertance)

//run this file directly using Ctrl + Alt + N


interface Animal {
    void sound(); // Abstract method
}

class Dog implements Animal {  //implements is a keyword
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interfaces {
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.sound();
    }
}


//run this file directly using Ctrl + Alt + N
