package com.test.payments;

public class CreditPaymentFactory implements AbstractPaymentFactory{
	
	@Override
	public Payments createPayment() {
		return new CreditPayment();
	}

}
