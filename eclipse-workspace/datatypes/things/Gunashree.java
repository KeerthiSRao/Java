package com.xworkz.datatypes.things;

public class Gunashree {

	public void drink() {
		System.out.println("running drink in GunashreeBottle...");

		WaterBottle waterBottle = new WaterBottle();
		waterBottle.quantity = 3;
		waterBottle.color = "Black";

		System.out.println(waterBottle.quantity);
		System.out.println(waterBottle.color);
	}

}
