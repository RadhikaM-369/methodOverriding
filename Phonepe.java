package com.xworkz.polymorphism;

public class Phonepe extends OnlinePayment{

	
	public void moneyTransfer(String paymentApp) {
		this.paymentApp=paymentApp;
		System.out.println("Transaction successful by - "+paymentApp);
		
	}
}
