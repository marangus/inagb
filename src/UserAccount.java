import java.math.BigDecimal;
import java.util.ArrayList;

//User Account which manages the users:
//- funds
//- Accounts
//- Envelopes

public class UserAccount
{
	//Instance variables
	
	private BigDecimal total;
	private BigDecimal undistributed;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	private ArrayList<Account> accounts;
	private ArrayList<Envelope> envelopes;
	private ArrayList<Category> categories;
	
	//constructor
	public UserAccount() {
		this.total = new BigDecimal(0.00);
		this.undistributed = new BigDecimal(0.00);
		this.envelopes = new ArrayList<Envelope>();
		this.accounts = new ArrayList<Account>();
		this.categories = new ArrayList<Category>();
	}
	
	//Setters and gettings methods
	
	/**
	 * Get Total 
	 *	Get the user total amount of available funds
	 *	@return BigDecimal The total amount of money the user has.  
	 */ 
	public BigDecimal getTotal() {
		return this.total;
	}
	
	/**
	 * GetUndistributed
	 * returns the amount of undistributed funds in the users account.
	 * @return BigDecimal The total amount of undistributed funds in 
	 * 						the users account. 
	 */
	public BigDecimal getUndistributed() {
		return this.undistributed;
	}
	
	/**
	 * Get Transactions
	 * Returns an arraylist of the transactions performed on the users 
	 * account and total money pool.
	 * <p>
	 * transactions can specify whether they are a deposit or withdrawal.
	 * @return ArrayList<Transaction> Returns an arraylist of transactions
	 * 									performed on the users account.
	 */
	public ArrayList<Transaction> getTransactions(){
		return this.transactions;
	}
	
	/**
	 * Set Total
	 * Set the total of the users total available funds
	 * @param BigDecimal total The total amount of funds available to the user
	 * @return void
	 */
	public void setTotal(BigDecimal total){
		this.total = total;
	}
	
	/** 
	 * Set Undistributed
	 * Set the amount of undistributed funds for the users account 
	 * @param BigDecimal amount The amount of funds which undistributed 
	 * 						funds should be set too.
	 * @return void
	 */
	public void setUndistributed(BigDecimal amount) {
		this.undistributed = amount;
	}
	
	/**
	 * Add Transaction
	 * Adds a transaction to the user's account of transactions
	 * @param transaction a withdrawal or deposit made on the users account
	 * @return void 
	 */
	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
	
	/**
	 * Remove Transaction
	 * Removes a transaction from the User's account of transactions
	 * @param transaction a withdrawal or deposit made on the users account
	 * @return void
	 */
	public void removeTransaction(Transaction transaction) {
		this.transactions.remove(transaction);
	}
	
	public void addCategory(Category category){
		categories.add(category);
	}
}
