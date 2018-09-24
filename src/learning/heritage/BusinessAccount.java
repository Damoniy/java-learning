package learning.heritage;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount(Integer number, String holder, Double initialDeposit, Double loanLimit) {
		super(number, holder, initialDeposit);
		this.setLoanLimit(loanLimit);
	}

	public BusinessAccount(Integer number, String holder, Double loanLimit) {
		super(number, holder);
		this.setLoanLimit(loanLimit);
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double loan) {
		if(loan <= loanLimit) {
			this.deposit(loan);
		}
	}
	
	public void withdraw(Double amount) {
		super.withdraw(amount);
		this.balance -= 2;
	}
}
