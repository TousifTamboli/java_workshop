// Constructors in Java

//Constructor is a type of function

// Constructors are used to initialize objects when they are created.

// The name of the constructor must be the same as the class name.

// Constructors do not return anything (no return type).

// Types of Constructors:

// Non-Parameterized Constructor

// Parameterized Constructor

// Copy Constructor


//Example 3: Non-Parameterized Constructor
class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    // Constructor
    Student() {
        System.out.println("Constructor called");
    }
}

public class OOPS3 {
    public static void main(String args[]) {
        Student s1 = new Student();  //new is a keyword  where a new memory is allocated. Student() is also a constructor
        s1.name = "Tousif";
        s1.age = 20;
        s1.printInfo();
    }
}