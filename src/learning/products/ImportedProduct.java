package learning.products;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct(String productName, Double price, Double customsFee) {
		super(productName, price);
		this.setCustomsFee(customsFee);
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return this.getPrice() + this.getCustomsFee();
	}
	
	public String priceTag() {
		return String.format("%s $ %.2f (Customs fee: $ %.2f)", this.getName(), this.totalPrice(), this.getCustomsFee());
	}
}
