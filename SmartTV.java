package com.xworkz.polymorphism;

public class SmartTV extends TV{


	public void connection(String connectionType) {
		
		this.connectionType=connectionType;
		System.out.println("Smart TV, Connected using - "+connectionType);
	}
}
