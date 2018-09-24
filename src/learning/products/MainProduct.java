package learning.products;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		
		int quantity = scan.nextInt();

		
		for(int i = 0; i < quantity; i++) {
			System.out.println("Product #" + (i + 1) + " data: ");
			System.out.println("Common, used or imported (c/u/i)?");
			char type = scan.next().charAt(0);
			
			System.out.println("Name: ");
			String name = scan.next();
			System.out.println("Price: ");
			Double price = scan.nextDouble();
						
			Product p = null;
			
			switch(type) {
				case 'c':
					p = new Product(name, price);
					list.add(p);
					break;
					
				case 'u':
					System.out.println("Manufacture date: ");
					String manufactureDate = scan.next();
					Date date = format.parse(manufactureDate);
					
					p = new UsedProduct(name, price, date);
					list.add(p);
					break;
					
				case 'i':
					System.out.println("Customs fee: ");
					Double customsFee = scan.nextDouble();
					
					p = new ImportedProduct(name, price, customsFee);
					list.add(p);
			}	
		}
		
		System.out.println("PRICE TAGS: ");
		
		for(int j = 0; j < quantity; j++) {
			System.out.println(list.get(j).priceTag());
		}
			
		
		scan.close();
	}
	
}
