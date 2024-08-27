package com.xworkz.inheritance;

public class Halwa {

	private String type;
	private double price;
	private int quantity;
	
	public Halwa() {
		System.out.println("Running Halwa..");
}
	public void taste(String type, double price, int quantity) {
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);


	}
}
