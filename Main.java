import mypackage.Student; 
import mypackage.PublicExample;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        PublicExample pub = new PublicExample();
        pub.show();
    }
}
