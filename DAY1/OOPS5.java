// Example 5: Copy Constructor

class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    // Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    
    // Default Constructor
    Student() {
    }
}

public class OOPS5 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Tousif";
        s1.age = 20;
        
        // Using Copy Constructor
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}