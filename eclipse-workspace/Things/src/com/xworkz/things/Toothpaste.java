package com.xworkz.things;

public class Toothpaste {

	private String company;
	private boolean salt;

	public Toothpaste(String company) {
		super();
		this.company = company;
		System.out.println("Running toothpaste with 1 args in Toothpaste");
	}

	public Toothpaste(String company, boolean salt) {
		super();
		this.company = company;
		this.salt = salt;
		System.out.println("Running toothpaste with 2 args in Toothpaste");

	}

	public void display() {
		System.out.println("Display in Toothpaste");
		System.out.println("Company : "+company);
		System.out.println("Salt? : "+salt);
	}
}
