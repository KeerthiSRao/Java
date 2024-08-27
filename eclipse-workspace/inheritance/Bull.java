package com.xworkz.inheritance;

public class Bull {

	public String location;
	public String color;
	public double weight;
	public int runSpeed;
	public String hornShape;

	public Bull() {
		System.out.println("created non argument bull constructor..");
	}

	public void bullDetails(String location, String color, double weight, int runspeed, String hornShape) {
		this.location = location;
		this.color = color;
		this.weight = weight;
		this.runSpeed = runSpeed;
		this.hornShape = hornShape;

		System.out.println("bull location : " + location);
		System.out.println("bull color : " + color);
		System.out.println("bull weight : " + weight);
		System.out.println("bull runSpeed : " + runSpeed);
		System.out.println("bull hornShape : " + hornShape);
	}

}
