import java.math.BigDecimal;

/* 
 * an account is place where money is stored, 
 * withdrawn and deposited in to
 */

public abstract class Account 
{
	//Static Variables
	
	//Instance Variables
	String name;
	BigDecimal amount;
	
	
	//Constructors
	public Account(String name, BigDecimal amount){
		this.name = name;
		this.amount = amount;
	}
	
	//Instance Methods
	
	
	//Setters and Getters
	
	/* 
	 * returns the name of the account
	 */
	public abstract String GetName();
	
	/*
	 * Sets the name of the account
	 */
	public abstract void SetName( String name);
	
	public abstract BigDecimal GetTotal();
	
	public abstract void Withdraw( BigDecimal amount );
	
	public abstract void Deposit( BigDecimal amount );
	
	//Static Methods
}
