package com.xworkz.polymorphism;

public class OnlinePayment {
String paymentApp;
long mobileNo;
int amount;

public void moneyTransfer(String paymentApp) {
	this.paymentApp=paymentApp;
	System.out.println("Transaction successful by - "+paymentApp);
}

public void payRent() {
	System.out.println("House rent paid succesfully");
}

public void paywaterBill() {
	System.out.println("Water bill paid succesfully");
}

}
