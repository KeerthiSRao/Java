package com.xworkz.inheritance;

public class Chicken {

	public String type;
	public double price;
	public double weight;
	public boolean egg;
	public char gender;
	public String itemName;
	public double itemPrice;
	public int itemQuantity;
	public String farmName;
	public int farmProfit;
	public Chicken() {

		System.out.println("Running Chicken");
	}
	public void chickenDetails(String type, double price, double weight, boolean egg, char gender, String itemName, double itemPrice, int itemQuantity, String farmName, int farmProfit) {
		this.type=type;
		this.price=price;
		this.weight=weight;
		this.egg=egg;
		this.gender=gender;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.itemQuantity=itemQuantity;
		this.farmName=farmName;
		this.farmProfit=farmProfit;

		System.out.println("chicken type : "+type);
		System.out.println("chicken price : "+price);
		System.out.println("chicken weight : "+weight);
		System.out.println("chicken egg : "+egg);
		System.out.println("chicken gender : "+gender);
		System.out.println("chicken itemName : "+itemName);
		System.out.println("chicken itemPrice : "+itemPrice);
		System.out.println("chicken itemQuantity : "+itemQuantity);
		System.out.println("chicken farmName : "+farmName);
		System.out.println("chicken farmProfit : "+farmProfit);
	}
	
}
