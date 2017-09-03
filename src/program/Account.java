package src.program;

import java.util.Currency;

public abstract class Account 
{
	//Static Variables
	
	//Instance Variables
	
	//Constructors
	
	
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
	
	public abstract Currency GetTotal();
	
	public abstract void Withdraw( Currency amount );
	
	public abstract void Deposit( Currency amount );
	
	//Static Methods
}
