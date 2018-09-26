package learning.exceptions;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
			System.out.println("Enter room number: ");
			Integer room = scan.nextInt();
			
			System.out.println("Enter the check-in date: ");
			Date checkin = format.parse(scan.next());
			
			System.out.println("Enter the check-out date: ");
			Date checkout = format.parse(scan.next());
			
			Reservation reserv = new Reservation(room, checkin, checkout);
			System.out.println(reserv);
			
			System.out.println("Enter data to update reservation dates: \nEnter room number: ");
			room = scan.nextInt();
			
			System.out.println("Enter the check-in date: ");
			checkin = format.parse(scan.next());
			
			System.out.println("Enter the check-out date: ");
			checkout = format.parse(scan.next());
			
			reserv.updateDates(checkin, checkout);
			System.out.println("Reservation: " + reserv);	
			
		} catch(ParseException e) {
			System.out.println("Invalid date format.");
		} catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error.");
		}
		
		scan.close();
	}

}
