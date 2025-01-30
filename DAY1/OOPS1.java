//Example 1: Basic Class and Object

class Pen {
    String color;
    String type; // Ballpoint, Gel

    public void write() {
        System.out.println("Writing");
    }
}

public class OOPS1 {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
    }
}