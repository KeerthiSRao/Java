package com.xworkz.city;

public class City {

	private String name;
	private int index;
	
	String[] citynames=new String[7];

	
	public void store (String name)
	{
	
		this.citynames[this.index]=name;
		index++;

	}
	public void mudrana(){
	for(String cityname:citynames)
	{
		System.out.println("Name : "+cityname);
	}
	
	
	
	
}
	
}
