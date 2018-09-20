package learning.order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OrderMain {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: \nName:");
		String name = scan.nextLine();
		
		System.out.println("Email: ");
		String email = scan.nextLine();
		
		System.out.println("Birth date (DD/MM/YYYY): ");
		String birthDate = scan.nextLine();
		Date date = format.parse(birthDate);
		
		Client client = new Client(name, email, date);
		
		System.out.println("Enter order data: \nStatus:");
		String status;
		status = scan.nextLine();
		EnumStatus orderStatus = EnumStatus.valueOf(status);
		
		System.out.println("How many items to this order? ");
		int quantity;
		quantity = scan.nextInt();
		Item[] item = new Item[quantity];

		Order order = new Order(orderStatus, client);
		
		for(int i = 0; i < item.length; i ++) {
		
			System.out.println("Enter # " + (i + 1) + " item data: ");
			System.out.println("Product name: ");
			String productName = scan.next();
						
			System.out.println("Product price: ");
			double price;
			price = scan.nextDouble();
			
			System.out.println("Quantity: ");
			int numberOf;
			numberOf = scan.nextInt();
			
			Product p = new Product(productName, price);
						
			item[i] = new Item(p.getName(), numberOf, p.getPrice());
			
			order.addItem(item[i]);
		}
		
		System.out.println(order);
		
		scan.close();
	}
}
