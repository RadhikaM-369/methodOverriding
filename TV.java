package com.xworkz.polymorphism;

public class TV {
String brand;
String color;
int price;
String connectionType;

public void connection(String connectionType) {
	this.connectionType=connectionType;
	System.out.println("Portable TV, connected using - "+connectionType);
	System.out.println();
}

public void changeSettings() {
	System.out.println("Change the settings here");
}
public void changeChannel() {
	System.out.println("Choose channel...");
}
public void on() {
	System.out.println("Tv is ON");
}
public void off() {
	System.out.println("TV is off");
}
}
