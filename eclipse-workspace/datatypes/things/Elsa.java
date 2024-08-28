package com.xworkz.datatypes.things;

public class Elsa {

	Snow snow=new Snow();
	
	public void olaf()
	{
		System.out.println("Created olaf in elsa");
		if(snow!=null) {
		snow.disney();
		System.out.println(snow.color);
		System.out.println(snow.location);
		}else {
			System.out.println("Snow is null");
		}

	}
}
