package com.test.payments;

public class CashPayment implements Payments{
	
	@Override
	public void pay() {
		System.out.println("Cash");
	}

}
