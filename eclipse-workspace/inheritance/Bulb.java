package com.xworkz.inheritance;

public class Bulb {

	private String brand;
	
	public Bulb() {
		System.out.println("Running Bulb...");
	}
	
	public void light(String brand) {
		this.brand=brand;
		System.out.println("Running light");
		System.out.println("Brand : "+brand);
	}
	
}
