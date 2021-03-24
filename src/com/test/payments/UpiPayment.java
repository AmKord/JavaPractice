package com.test.payments;

public class UpiPayment implements Payments{
	
	@Override
	public void pay() {
		System.out.println("UPI Payment");
	}

}
