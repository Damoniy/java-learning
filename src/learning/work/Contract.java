package learning.work;

import java.util.Date;

public class Contract {
	private Date admission;
	private double valuePerHour;
	private int duration;

	public Contract(Date admission, double valuePerHour, int duration) {
		this.setAdmissionDate(admission);
		this.setRemunerationPerHour(valuePerHour);
		this.setDuration(duration);
	}
	
	public void setAdmissionDate(Date admission) {
		this.admission = admission;
	}
	
	public void setRemunerationPerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Date getAdmissionDate() {
		return admission;
	}
	
	public double getRemunerationPerHour() {
		return valuePerHour;
	}
	
	public int getDuration() {
		return duration;
	}
}
