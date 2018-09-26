package learning.exercises.account;

import java.util.Scanner;

import learning.exercises.account.exceptions.AmountOutOfLimitException;
import learning.exercises.account.exceptions.NoFundsException;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: \nNumber: ");
			Integer number = scan.nextInt();
			
			System.out.println("Holder: ");
			scan.nextLine();
			String owner = scan.nextLine();
			
			System.out.println("Current balance: ");
			Double balance = scan.nextDouble();
			
			System.out.println("Withdraw limit: ");
			Double limit = scan.nextDouble();
			
			Account acc = new Account(owner, number, balance, limit);
			
			System.out.println("Enter amount to withdraw: ");
			Double amount = scan.nextDouble();
			acc.withdraw(amount);
			
		} catch (AmountOutOfLimitException e) {
			System.out.println("Couldn't possibly realize your request: " + e.getMessage());
		} catch (NoFundsException e) {
			System.out.println("Couldn't possibly realize your request: " + e.getMessage());
		}
		
		scan.close();
	}

}
