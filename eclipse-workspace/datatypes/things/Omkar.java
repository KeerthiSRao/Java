package com.xworkz.datatypes.things;

public class Omkar {

	public void tear(Shoe shoe) {
		if(shoe!=null) {
		shoe.safeGuard();
		System.out.println(shoe.brand);
		System.out.println(shoe.cost);
	}
	else {
		System.out.println("Shoe is null");
	}
	}
	
}
