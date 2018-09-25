package learning.abstractclasses;

import java.util.ArrayList;
import java.util.List;

public class AbstractMain {
	
	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<>();
		
		Account business = new BusinessAccount(20050, "Alex Green", 500.0);
		SavingsAccount saving = new SavingsAccount(50001, "Maria Brown", 500.0, 0.01);
		
		accounts.add(business);
		accounts.add(saving);
		
		business.deposit(500.0);
		saving.withdraw(100.0);
		
		business.withdraw(360.0);
		saving.withdraw(150.0);
		
		saving.updateBalance();
		
		Double totalValue = 0.0;
		
		for(Account x: accounts) {
			x.deposit(10000.00);
			totalValue += x.getBalance();
		}
		
		System.out.println(business.getInfo());
		System.out.println(saving.getInfo());
		System.out.println(totalValue);
	}
}
