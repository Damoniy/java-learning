package learning.products;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactureDate;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String productName, Double price, Date manufactureDate) {
		super(productName, price);
		this.setManufactureDate(manufactureDate);
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public String priceTag() {
		return String.format("%s $ %.2f (Manufacture date: %s)", this.getName(), this.getPrice(), format.format(getManufactureDate()));
	}
}
