// Parent class: Student
class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class 1: Student1
class Student1 extends Student {
    void showStudent1() {
        System.out.println(name + " is from Class TYDS.");
    }
}

// Child class 2: Student2
class Student2 extends Student {
    void showStudent2() {
        System.out.println(name + " is from Class SYDS.");
    }
}

// Child class 3: Student3
class Student3 extends Student {
    void showStudent3() {
        System.out.println(name + " is from Class Fouth Year Data Science.");
    }
}

// Main class
public class StudentProject {
    public static void main(String[] args) {
        // Creating object of Student1
        Student1 s1 = new Student1();
        s1.name = "Tousif";
        s1.age = 20;
        s1.displayInfo();
        s1.showStudent1();
        System.out.println();

        // Creating object of Student2
        Student2 s2 = new Student2();
        s2.name = "Shubham";
        s2.age = 19;
        s2.displayInfo();
        s2.showStudent2();
        System.out.println();

        // Creating object of Student3
        Student3 s3 = new Student3();
        s3.name = "Naman";
        s3.age = 20;
        s3.displayInfo();
        s3.showStudent3();
    }
}
