// Base class
class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

// Child class 1
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// Child class 2
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class HierarchicalInheritance {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        c1.area(7);
    }
}
