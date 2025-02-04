package pakages.bank;

class Account{
    public String name; //if we remove public ot will become default
    protected String email; //only within pakage and only subclass can acess
    private String password; 

    //getters and setters
    //getter
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Tousif Account";
        account1.email = "tousiftamboli3@gmail.com";
        // account1.password = "abc@123";  //this will not work without getters and setters as it is private
        account1.setPassword("abc@123");
        System.out.println(account1.getPassword());
    }
}
