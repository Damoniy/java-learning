package learning.employee;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;

	public OutsourcedEmployee(String name, int hours, double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.setAdditionalCharge(additionalCharge);
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double getSalary() {
		return (super.getSalary()) + (1.1 * this.getAdditionalCharge());
	}
}
