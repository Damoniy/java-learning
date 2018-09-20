package learning.order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date moment = new Date();
	private EnumStatus status;
	private Client client;
	
	private List<Item> order = new ArrayList<>();
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order(EnumStatus status, Client client) {
		this.setStatus(status);
		this.setClient(client);
	}
	
	public Date getDate() {
		return moment;
	}

	public EnumStatus getStatus() {
		return status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setStatus(EnumStatus status) {
		this.status = status;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<Item> getOrder() {
		return order;
	}

	public void addItem(Item item) {
		order.add(item);
	}
	
	public void removeItem(Item item) {
		order.add(item);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ORDER SUMMARY: \n");
		builder.append("Order moment: " + format.format(moment) + "\n");
		builder.append("Order status: " + status.toString());
		builder.append(String.format("%nClient: %s (%s) - %s%n", 
				client.getName(), client.getBirthDate(), client.getEmail()));
		
		double totalValue = 0;
		
		for(int i = 0; i < order.size(); i++) {
						
			builder.append(
			String.format("Order items:%n%s, %.2f, %d, Subtotal: %.2f%n", 
					order.get(i).getName(), order.get(i).getPrice(), order.get(i).getQuantity(), order.get(i).subTotal()));
		
			totalValue += order.get(i).subTotal();
		}
		
		builder.append("Total price: " + totalValue);
		
		return builder.toString();
	}
}
