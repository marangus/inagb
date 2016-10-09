//interface for budget software

public class interface{

    // allow user to add account 
    public void addAccount(String name, Money value){
        Account newAccount = new Account(name, value);
    }
    
}
