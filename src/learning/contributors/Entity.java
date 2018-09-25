package learning.contributors;

public abstract class Entity {
	
	protected String name;
	protected Double income;
	
	public Entity(String name, Double income) {
		this.setName(name);
		this.setIncome(income);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
	
	public String toString() {
		return String.format("%s: $ %.2f", this.getName(), this.paidTaxes());
	}
	
	public abstract Double paidTaxes();
}
