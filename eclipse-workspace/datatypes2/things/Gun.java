package com.xworkz.datatypes2.things;

public class Gun {

	private String name;
	private String countryMade;
	private String type;

	public Gun() {
		System.out.println("Created gun with no-args..");
	}

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}

	public void fire() {
		System.out.println("Created fire");
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Country Made : " + countryMade);
		System.out.println("Type : " + type);
	}
}
