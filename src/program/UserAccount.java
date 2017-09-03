package src.program;

import java.util.Currency;

import src.transactions.Transaction;

public class UserAccount extends Account 
{
	//Instance variables
	private Money total;
	private Money undistributed;
	private Transaction[] transaction;
	
	//constructor
	public UserAccount() {
		this.total = new Money();
		undistributed = new Money();
	}
	
	//Setters and Getters
	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Currency GetTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Withdraw(Currency amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deposit(Currency amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Withdraw(Currency amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deposit(Currency amount) {
		// TODO Auto-generated method stub
		
	}
	
}
