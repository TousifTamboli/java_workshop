// Base class
class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

// Child class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// Another child class extending Triangle
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

public class MultiLevelInheritance {
    public static void main(String args[]) {
        EquilateralTriangle eqT = new EquilateralTriangle();
        eqT.area(10, 5);
    }
}
