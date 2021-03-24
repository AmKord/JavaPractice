package com.test.payments;

public class CreditPayment implements Payments{
	
	@Override
	public void pay() {
		System.out.println( "Credit Payment");
	}

}
