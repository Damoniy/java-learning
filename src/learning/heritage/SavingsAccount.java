package learning.heritage;

public class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount(Integer number, String holder, Double initialDeposit, Double interestRate) {
		super(number, holder, initialDeposit);
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		this.balance -= amount;
	}

}
