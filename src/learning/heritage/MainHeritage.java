package learning.heritage;

public class MainHeritage {
	
	public static void main(String[] args) {
		
		Account acc = new Account(38473, "Alex", 500.0);
		Account sacc = new SavingsAccount(38681, "Bob", 500.0, 0.0);
		Account bacc = new BusinessAccount(32349, "Maria", 500.0, 0.0);

		acc.withdraw(450.0);
		sacc.withdraw(450.0);
		bacc.withdraw(450.0);

		System.out.println(acc.getBalance());
		System.out.println(sacc.getBalance());
		System.out.println(bacc.getBalance());

	}
}
