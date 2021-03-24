package com.test.payments;

public class PaymentsFactory {
	
	public static Payments getPayment(AbstractPaymentFactory factory) {
		return factory.createPayment();
	}
	
	public Payments paymentsFactory(String type) {
		
		if(type.equals("Credit")) {
			return new CreditPayment();
		}
		if(type.equals("UPI")) {
			return new UpiPayment();
		}
		return new CashPayment();
	}

}
