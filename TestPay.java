package com.xworkz.polymorphism;

public class TestPay {

	public static void main(String[] args) {

		OnlinePayment payment= new OnlinePayment();
		payment.moneyTransfer("Google Pay");
		
		Phonepe phonepe=new Phonepe();
		phonepe.moneyTransfer("BHIM UPI");

	}

}
