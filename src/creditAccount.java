import java.math.BigDecimal;

public class creditAccount extends Account {
	
	//Instance Variables
	BigDecimal creditLimit = new BigDecimal(0.00); 

	//Constructors
	public creditAccount(String name, BigDecimal amount, BigDecimal creditLimit) {
		super(name, amount);
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
	
	public BigDecimal GetCreditLimit() {
		return this.creditLimit;
	}

	public void SetCreditLimit(BigDecimal amount) {
		this.creditLimit = amount;
	}

	@Override
	public BigDecimal GetTotal() {
		return this.amount;
	}

	@Override
	public void Withdraw(BigDecimal amount) {
		this.amount = this.amount.subtract(amount);
	}

	@Override
	public void Deposit(BigDecimal amount) {
		this.amount = this.amount.add(amount);
	}

}
