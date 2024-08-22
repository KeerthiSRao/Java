package com.xworkz.sweet;

public class Sweet {

	private String name;
	private int index;
	
	String[] sweetnames=new String[7];

	
	public void store (String name)
	{
	
		this.sweetnames[this.index]=name;
		index++;

	}
	public void mudrana(){
	for(String sweetname:sweetnames)
	{
		System.out.println("Name : "+sweetname);
	}
	
	
	
	
}
	
}
