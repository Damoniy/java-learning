package learning.employee;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of employeers: ");
				
		int number = scan.nextInt();
		char choice;
		String name;
		Integer hours;
		Double valuePerHour;
		Double additionalCharge;
		
		Employee[] employee = new Employee[number];
		
		for(int i = 0; i < number; i++) {
			System.out.println("Employee data #" + (i + 1) + ":" );
			System.out.println("Outsourced? (y/n)");
			choice = scan.next().charAt(0);
			
			System.out.println("Name: ");
			name = scan.next();
			System.out.println("Hours: ");
			hours = scan.nextInt();
			System.out.println("Value per hour: ");
			valuePerHour = scan.nextDouble();
			
			if(choice == 'y') {
				System.out.println("Additional charge: ");
				additionalCharge = scan.nextDouble();
				
				employee[i] = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			} else {
				employee[i] = new Employee(name, hours, valuePerHour);
			}
		}
		
		
		for(int j = 0; j < number; j++) {
			System.out.println(employee[j]);
		}
	
		scan.close();
	}
	
}
