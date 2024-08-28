package com.xworkz.datatypes.things;

public class Anna {

	
	public void freeze(Snow snow) {
		System.out.println("Created freeze in anna");
		
		if(snow!=null) {
			snow.snowman();
			snow.frozen();
		}else {
			System.out.println("Snow is null");
		}
	}
}
