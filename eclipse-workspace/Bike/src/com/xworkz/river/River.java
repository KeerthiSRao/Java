package com.xworkz.river;

public class River {

	private String name;
	private int index;
	
	String[] rivernames=new String[7];

	
	public void store (String name)
	{
	
		this.rivernames[this.index]=name;
		index++;

	}
	public void mudrana(){
	for(String rivername:rivernames)
	{
		System.out.println("Name : "+rivername);
	}
	
	
	
	
}
	
}
