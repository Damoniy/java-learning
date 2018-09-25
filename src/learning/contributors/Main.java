package learning.contributors;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Entity> entities = new ArrayList<>();		
		
		System.out.println("Enter the number of tax payers: ");
		
		int taxPayers = scan.nextInt();
		
		for(int i = 0; i < taxPayers; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data: \n"
					+ "Individual or campany? (i/c)");
			
			char type = scan.next().charAt(0);
			System.out.println("Name: ");
			String name = scan.next();
			
			System.out.println("Annual income: ");
			double income = scan.nextDouble();
			
			switch(type) {

				case 'i':
					System.out.println("Health expenditures: ");
					double healthSpending = scan.nextDouble();
					entities.add(new EntityPhysical(name, income, healthSpending));
				break;
				
				case 'c':
					System.out.println("Number of employees: ");
					int numberOfEmployees = scan.nextInt();
					entities.add(new EntityLegal(name, income, numberOfEmployees));
			}
		}
		
		double totalIncomes = 0.0;
		
		for(Entity x : entities) {
			System.out.println(x.toString());
			
			totalIncomes = x.paidTaxes();
		}
		
		System.out.println("Total taxes: " + totalIncomes);
		
		scan.close();
	}
	
}
