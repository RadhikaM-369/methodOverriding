package com.xworkz.polymorphism;

public class LCDTV extends TV{
	
		
	public void connection(String connectionType) {
		
		
		this.connectionType=connectionType;
		System.out.println("LCD Tv, Connected using - "+connectionType);
		System.out.println();
	}
}
