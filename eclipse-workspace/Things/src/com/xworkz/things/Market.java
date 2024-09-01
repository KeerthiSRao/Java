package com.xworkz.things;

public class Market {

	private String name;
	private String location;
	private int shops;
	private String type;

	public Market(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public Market(int shops, String type) {
		super();
		this.shops = shops;
		this.type = type;
	}

	public void mudrana() {
		System.out.println("Name : " + name);
		System.out.println("Location : " + location);
		System.out.println("Shops : " + shops);
		System.out.println("Type : " + type);

	}

}
