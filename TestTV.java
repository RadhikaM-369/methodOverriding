package com.xworkz.polymorphism;

public class TestTV {

	public static void main(String[] args) {
		
		System.out.println("        Television information        ");
		System.out.println("--------------------------------------");
		
		
		TV tv=new TV();
		tv.connection("Cable");
				
		 LCDTV lcd=new LCDTV();
		lcd.connection("Bluetooth");

		SmartTV smart=new SmartTV();
		smart.connection("WIFI");
		smart.changeSettings();

	}

}
