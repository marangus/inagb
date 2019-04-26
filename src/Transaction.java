import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
	private Date date;
	private String entity;
	private String note;
	private BigDecimal amount;
	private TransactionType transactiontype;
	
	/**
	 * Transaction
	 * Constructor for Transaction instance defines whether it is a withdrawal 
	 * or deposit.
	 * @param date The date at which the transaction occurred
	 * @param entity The entity which either made the deposit or 
	 * 					made the withdrawal
	 * @param note A note explaining what the transaction is for or any 
	 * 				other information 
	 * @param amount The amount the transaction is for
	 * @param transactionType The type of transaction performed this can be either 
	 * 							a withdrawal or a deposit
	 */
	public Transaction(Date date, 
						String entity, 
						String note,
						BigDecimal amount,
						TransactionType transactionType
						){
		this.date = date;
		this.entity = entity;
		this.note = note;
		this.amount = amount;
		this.transactiontype = transactionType;
	}
	
	/**
	 * GetDate
	 * Returns the date at which the transaction occurred
	 * @return Date The date at which the transaction occurred
	 */
	public Date getDate() {
		return this.date;
	}
	
	/**
	 * setDate
	 * Set the date at which a transaction occured.
	 * @param date the date of the transaction
	 * @return void
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * getEntity
	 * Returns the entity that is responsible for the withdrawal or deposit
	 * @return entity The entity payer/payee responsible for a withdrawal/deposit respectively
	 */
	public String getEntity() {
		return this.entity;
	}
	
	/**
	 * setEntity
	 * set the entity which is is either the payer or payee of the transaction
	 * @param entity of the the transaction either a payer or payee
	 * @return void
	 */
	public void setEntity(String entity){
		this.entity = entity;
	}
	
	/** 
	 * get
	 */
}
