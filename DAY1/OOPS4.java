// Example 4: Parameterized Constructor

class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OOPS4 {
    public static void main(String args[]) {
        Student s1 = new Student("Tousif", 20);
        s1.printInfo();
    }
}