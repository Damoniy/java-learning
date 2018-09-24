package learning.products;

public class Product {

	private String productName;
	private Double price;
		
	public Product(String productName, Double price) {
		this.setProductName(productName);
		this.setPrice(price);
	}

	public String getName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return String.format("%s $ %.2f", this.getName(), this.getPrice());
	}
}
