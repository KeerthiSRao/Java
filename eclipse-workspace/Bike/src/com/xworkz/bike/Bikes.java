package com.xworkz.bike;

public class Bikes {

	private String name;
	private int index;
	
	String[] bikenames=new String[7];

	
	public void store (String name)
	{
	
		this.bikenames[this.index]=name;
		index++;

	}
	public void mudrana(){
	for(String bikename:bikenames)
	{
		System.out.println("Name : "+bikename);
	}
	
	
	
	
}
}