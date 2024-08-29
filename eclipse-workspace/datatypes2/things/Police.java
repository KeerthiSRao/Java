package com.xworkz.datatypes2.things;

public class Police {

	public void protect(Gun gun) {
		
		if(gun!=null) {
			System.out.println("Created protect");
			gun.display();
		}
	}
}
