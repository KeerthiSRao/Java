package com.xworkz.dam;

public class Dam {

	private String name;
	private int index;
	
	String[] damnames=new String[7];

	
	public void store (String name)
	{
	
		this.damnames[this.index]=name;
		index++;

	}
	public void mudrana(){
	for(String damname:damnames)
	{
		System.out.println("Name : "+damname);
	}
	
	
	
	
}
	
}
