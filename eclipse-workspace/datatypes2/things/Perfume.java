package com.xworkz.datatypes2.things;

public class Perfume {

	private String brand;
	private double price;
	private String color;
	
	public Perfume() {
		System.out.println("Created Perfume");
		
	}

	public Perfume(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public void mudrana() {
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Color : "+color);

	}
	
}
