package mypackage;  

//How to run in terminal: 
//1. open terminal and check the path is correct of the current file. if not navigate using 'cd filename'
// in my case it is 'PS C:\Users\Tousif M Tamboli\Downloads\java_workshop>'

// cmds: 
// 1. javac mypackage/*.java --- this will compile all the files in your mypackage folder
// 2. java mypackage.DefaultExampleTest --- this will run the file

public class DefaultExampleTest {
    public static void main(String[] args) {
        DefaultExample d1 = new DefaultExample(); 
        d1.show();
    }
}
