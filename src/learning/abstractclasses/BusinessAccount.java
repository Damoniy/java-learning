package learning.abstractclasses;

public class BusinessAccount extends Account{
	
	public BusinessAccount(Integer number, String owner, Double balance) {
		super(number, owner, balance);
	}
	
	public void withdraw(Double amount) {
		this.balance -= (amount + 5.0);
	}	
}
