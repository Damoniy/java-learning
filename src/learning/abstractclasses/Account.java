package learning.abstractclasses;

public abstract class Account {
	
	protected Integer number;
	protected String owner;
	protected double balance;
		
	public Account(Integer number, String owner, Double balance) {
		this.setAccountNumber(number);
		this.setOwner(owner);
		this.deposit(balance);
	}
	
	public Integer getAccountNumber() {
		return number;
	}
	public void setAccountNumber(int number) {
		this.number = number;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(Double amount) {
		this.balance -= amount;
	}
	
	public String getInfo() {
		return String.format("Account's owner: %s%nNumber: %d%nBalance: %.2f%n", 
				this.getOwner(), this.getAccountNumber(), this.getBalance());
	}
}
