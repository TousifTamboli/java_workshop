import mypackage.ProtectedExample; //import package that we are using

//How to run in terminal: 
//1. open terminal and check the path is correct of the current file. if not navigate using 'cd filename'
// in my case it is 'PS C:\Users\Tousif M Tamboli\Downloads\java_workshop>'
//cmd : write javac filename.java
// java filename

public class ProtectedExampleTest extends ProtectedExample{
    public static void main(String[] args) {
        ProtectedExampleTest p1 = new ProtectedExampleTest();
        p1.display();
    }
}
