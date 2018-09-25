package learning.contributors;

public class EntityLegal extends Entity {

	private Integer numberOfEmployees;
	
	public EntityLegal(String name, Double income, Integer numberOfEmployees) {
		super(name, income);
		this.setNumberOfEmployees(numberOfEmployees);
	}

	@Override
	public Double paidTaxes() {
		if(this.getNumberOfEmployees() <= 10) {
			return (this.getIncome() * 0.16);
		} else {
			return (this.getIncome() * 0.14);
			}
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

}
