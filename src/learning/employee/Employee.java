package learning.employee;

public class Employee {
	
	protected String name;
	protected int hours;
	protected double valuePerHours;
	
	public Employee(String name, int hours, double valuePerHours) {
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}
	
	public Double getSalary() {
		return this.getValuePerHours() * this.getHours();
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s - $ %.2f", 
				this.getName(), this.getSalary());
	}
}
