package learning.exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
	
		if(checkIn.after(checkOut)) {
			throw new DomainException("Checkout date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates.");
		}
		
		if(checkIn.after(checkOut)) {
			throw new DomainException("Checkout date must be after check-in date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null;
	}
	
	public String toString() {
		return String.format("Reservation: Room %d, checkin %s, checkout %s, %d nights ", 
				this.getRoomNumber(), format.format(this.getCheckIn()), 
				format.format(this.getCheckOut()), this.duration());
	}
}
