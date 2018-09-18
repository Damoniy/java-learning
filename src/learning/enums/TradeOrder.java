package learning.enums;

import java.util.Date;

public class TradeOrder {
	
	private Integer id;
	private Date moment;
	private EnumStatus status;
	
	public TradeOrder(Integer id, Date moment, EnumStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setDate(Date moment) {
		this.moment = moment;
	}
	
	public void setStatus(EnumStatus status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	
	public Date getMoment() {
		return moment;
	}

	public EnumStatus getStatus() {
		return status;
	}
	
	public String toString() {
		return String.format("Purchase Id: %d%nOperation date: %s%nStatus: %s", 
				this.getId(), this.getMoment(), this.getStatus());
	}
}
