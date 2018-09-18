package learning.enums;

import java.util.Date;

public class EnumsMain {
	
	public static void main(String[] args) {
		
		TradeOrder order = new TradeOrder(1080, new Date(), EnumStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

}
