import java.math.BigDecimal;

public class expectedCost {
	private String note;
	private BigDecimal amount;
	
	public expectedCost(String note, BigDecimal amount) {
		this.setNote(note);
		this.setAmount(amount);
	}

	/**
	 * getNote
	 * returns 
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
