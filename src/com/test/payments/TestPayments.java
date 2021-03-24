package com.test.payments;

public class TestPayments {
	
	public static void main(String[] args) {
		
		PaymentsFactory paymentFactory = new PaymentsFactory();
		Payments payment = paymentFactory.paymentsFactory("Credit");
		payment.pay();
		payment = paymentFactory.paymentsFactory("UPI");
		payment.pay();
		payment = paymentFactory.paymentsFactory("Cash");
		payment.pay();
		
		payment = PaymentsFactory.getPayment(new CreditPaymentFactory());
		payment.pay();
	}

}
