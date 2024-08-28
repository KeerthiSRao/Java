package com.xworkz.datatypes.things;

public class Shoe {

	public String brand="Nike";
	public double cost=6000;
	
	public Shoe() {
		System.out.println("Created Shoe with no-arg const..");
	}
	
	public void safeGuard() {
		System.out.println("Created safeguard in shoe");
	}
	
}
