package com.xworkz.datatypes.things;

public class Snowfall {

	public void cold()
	{
		System.out.println("Created cold in snowfall");
		
		Snow snow = new Snow();
		snow.snowman();
		snow.frozen();
		snow.disney();
		System.out.println(snow.location);
		System.out.println(snow.color);
	}
}
