//run this file directly using Ctrl + Alt + N

class Person {
    public String name;      // Public - accessible everywhere
    protected int age;       // Protected - accessible within the same package and in subclasses
    String city;             // Default (Package-private) - accessible only within the same package
    private String password; // Private - accessible only within this class

    public String getName(String name){
        this.name = name;
        return name;
    }
    public int getAge(int age){
        this.age = age;
        return age;
    }
    public String getCity(String city){
        this.city = city;
        return city;
    }
    

    // Getter and Setter for private variable
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

public class GettersSetters {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tousif";       // Public - Accessible
        p1.age = 22;              // Protected - Accessible (same package)
        p1.city = "Pune";         // Default - Accessible (same package)
        
        // p1.password = "secret"; // ❌ Error! (Private variable cannot be accessed directly)


        p1.setPassword("secret123"); // ✅ Set password using setter
        System.out.println("Name: " + p1.getName(p1.name)); 
        System.out.println("age: " + p1.getAge(p1.age)); 
        System.out.println("city: " + p1.getCity(p1.city)); 
        System.out.println("Password: " + p1.getPassword()); // ✅ Get password using getter
    }
}
