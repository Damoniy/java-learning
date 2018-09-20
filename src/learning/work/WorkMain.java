package learning.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class WorkMain {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sformat1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sformat2 = new SimpleDateFormat("MM/yyyy");

		System.out.print("Enter department's name: ");
		String department = scan.next();
		
		System.out.print("Enter worker data: \nName: ");
		String name = scan.next();
		
		System.out.print("Level: ");
		scan.nextLine();
		String type = scan.next();
		
		System.out.print("Base salary: ");
		double baseSalary = scan.nextDouble();
		Worker worker = new Worker(department, name, EnumLevel.valueOf(type), baseSalary);
		
		System.out.println("How many contracts to this worker? ");
		int number = scan.nextInt();
		Contract[] ct = new Contract[number];
		
		String date = "";
		
		Date dt = null;
		Date dt2 = null;
				
		for(int i = 0; i < ct.length; i++) {
			System.out.println("Enter the contract #" + (i + 1) + " data: ");
			System.out.println("Date (DD/MM/YYYY): ");
			date = scan.next();
			
			System.out.println("Value per hour:");
			double valuePerHour = scan.nextDouble();
			
			System.out.println("Duration (hours): ");
			int duration = scan.nextInt();
			
				try {
					dt = sformat1.parse(date);
				
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
			ct[i] = new Contract(dt, valuePerHour, duration);
		}
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String date2 = scan.next();
		
		try {
			dt2 = sformat2.parse(date2);
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		double finalSalary = 0;
		
		for(int k = 0; k < ct.length; k++) { 
			if(ct[k].getAdmissionDate().getMonth() == dt2.getMonth()) {
				
				finalSalary += (ct[k].getRemunerationPerHour() * ct[k].getDuration());
			}
		}

		System.out.print(worker.toString());
		System.out.println("Incomes for " + sformat2.format(dt2) + ": " + (finalSalary + worker.getSalary()));
		
		scan.close();
	}
}
