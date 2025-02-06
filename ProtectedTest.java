import mypackage.ProtectedExample;

public class ProtectedTest extends ProtectedExample {
    public static void main(String[] args) {
        ProtectedTest obj = new ProtectedTest();
        obj.display();  // Allowed because of inheritance
    }
}
