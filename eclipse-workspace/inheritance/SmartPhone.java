package com.xworkz.inheritance;

public class SmartPhone {

	private String brand;
	private String color;
	private double price;
	private String OS;
	
	public SmartPhone() {
		System.out.println("Running SmartPhone");
	}
	
	public void mobile (String brand, String color, double price, String OS) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.OS=OS;
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
		System.out.println("OS : "+OS);

		
	}
}
