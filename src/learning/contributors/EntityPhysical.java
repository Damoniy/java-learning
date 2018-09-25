package learning.contributors;

public class EntityPhysical extends Entity{

	private Double healthSpending;
	
	public EntityPhysical(String name, Double income, Double healthSpends) {
		super(name, income);
		this.setHealthSpending(healthSpends);
	}

	@Override
	public Double paidTaxes() {
		if(this.getIncome() < 20000) {
			return (this.income * 0.15) - (this.getHealthSpending() * 0.5);
		} else {
			return (this.income * 0.25) - (this.getHealthSpending() * 0.5);
			}
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

}
