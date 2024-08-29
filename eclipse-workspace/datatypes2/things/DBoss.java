package com.xworkz.datatypes2.things;

public class DBoss {

	Gun gun=new Gun("MM1777","France","Musket");
	
	public void jail() {
		if(gun!=null) {
		System.out.println("Created jail");
		gun.fire();
		gun.display();
		}
		else {
			System.out.println("Gun is null");
		}
	}
}
