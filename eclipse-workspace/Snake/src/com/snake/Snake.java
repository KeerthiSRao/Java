package com.snake;

public class Snake {

	String name;
	int length;
	String type;
	
	public Snake(String name, int length, String type)
	{
		this.name=name;
		this.length=length;
		this.type=type;
		System.out.println("Created Snake");
	}
	
	public void mudrana()
	{
		System.out.println("Name : "+name);
		System.out.println("Length : "+length);
		System.out.println("Type : "+type);

	}
}
