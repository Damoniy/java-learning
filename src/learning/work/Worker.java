package learning.work;

public class Worker {
	private String department;
	private String name;
	private EnumLevel level;
	private double baseSalary;
	
	public Worker(String department, String name, EnumLevel level, double baseSalary) {
		this.setName(name);
		this.setDepartment(department);
		this.setLevel(level);
		this.setSalary(baseSalary);
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLevel(EnumLevel level) {
		this.level = level;
	}
	
	public void setSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public String getName() {
		return this.name;
	}
	
	public EnumLevel getLevel() {
		return this.level;
	}
	
	public double getSalary() {
		return this.baseSalary;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s%nDepartment: %s%n", getName(), getDepartment());
	}
}
