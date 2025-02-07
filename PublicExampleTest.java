import mypackage.PublicExample; //import package that we are using

//How to run in terminal: 
//1. open terminal and check the path is correct of the current file. if not navigate using 'cd filename'
// in my case it is 'PS C:\Users\Tousif M Tamboli\Downloads\java_workshop>'
//cmd : write javac filename.java
// java filename

public class PublicExampleTest {
    public static void main(String[] args) {
        PublicExample p1 = new PublicExample();
        p1.show();
    }
    
}
