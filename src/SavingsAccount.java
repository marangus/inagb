import java.math.BigDecimal;

public class SavingsAccount extends Account {

	//instance variables
	private BigDecimal interestRate;
	
	//Constructors
	public SavingsAccount( String name, BigDecimal currentAmount) {
		super(name, currentAmount);
		this.interestRate = new BigDecimal(0.00);
	}
	
	public SavingsAccount( String name, BigDecimal currentAmount, BigDecimal interestRate) {
		super(name, currentAmount);
		this.interestRate = interestRate;
	}
	
	//instance methods
	public BigDecimal calculateInterest() {
		BigDecimal interest = this.amount.multiply(interestRate);
		return interest;
	}

	//Mutators
	@Override
	public String GetName() {
		return this.name;
	}

	@Override
	public void SetName(String name) {
		this.name = name;
	}

	@Override
	public BigDecimal GetTotal() {
		return this.amount;
	}

	@Override
	public void Withdraw(BigDecimal amount) {
		
	}

	@Override
	public void Deposit(BigDecimal amount) {
		// TODO Auto-generated method stub
		
	}
}