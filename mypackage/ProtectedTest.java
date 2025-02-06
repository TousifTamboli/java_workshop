package mypackage;

public class ProtectedTest {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        obj.display();  // Allowed because of inheritance
    }
}
