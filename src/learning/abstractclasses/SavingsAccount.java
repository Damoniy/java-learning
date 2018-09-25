package learning.abstractclasses;

public class SavingsAccount extends Account{

	private Double income;
	
	public SavingsAccount(Integer number, String owner, Double balance, Double income) {
		super(number, owner, balance);
		this.setIncome(income);
	}
	
	public void setIncome(Double income) {
		this.income = income;
	}
	
	public Double getIncome() {
		return income;
	}
	
	public void updateBalance() {
		this.balance *= (1.0 + this.getIncome());
	}
}
