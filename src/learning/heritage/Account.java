package learning.heritage;

public class Account {

	protected Integer number;
	protected String holder;
	protected double balance;
	
	public Account(Integer number, String holder, Double initialDeposit) {
		this.setNumber(number);
		this.setHolder(holder);
		this.deposit(initialDeposit);
	}
	
	public Account(Integer number, String holder) {
		this.setNumber(number);
		this.setHolder(holder);
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		this.balance -= (5.0 + amount);
	}
}
