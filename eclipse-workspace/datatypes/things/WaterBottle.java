package com.xworkz.datatypes.things;

public class WaterBottle {

	public int quantity;
	public String color;

	public WaterBottle() {

		System.out.println("created WaterBottle constructor with no arg....");
	}

	public void fill() {
		System.out.println("running fill in water bottle");
	}

	public void empty() {
		System.out.println("running empty in waterBottle");
	}

	public void crush() {
		System.out.println("running crush in waterBottle");
	}
}
