package learning.exercises.account;

import learning.exercises.account.exceptions.AmountOutOfLimitException;
import learning.exercises.account.exceptions.NoFundsException;

public class Account {
	
	private String owner;
	private Integer number;
	private double balance;
	
	public Account(String owner, Integer number, Double balance, Double withdrawLimit) {
		this.setOwner(owner);
		this.setNumber(number);
		this.deposit(balance);
		this.setWithdrawLimit(withdrawLimit);
	}
	
	private Double withdrawLimit;
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(Double amount) {
		
		if(amount > getWithdrawLimit()) {
			throw new AmountOutOfLimitException("Amount out of limit!");
		}
		
		if(amount > balance) {
			throw new NoFundsException("You have no funds to the operation.");
		}

		this.balance -= amount;
		
		System.out.println("New balance: " + getBalance());
	}
}
