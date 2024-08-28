package com.xworkz.datatypes.things;

public class Harshitha {

	public Shoe shoe;
	
	public void run() {
		if (shoe != null) {
			shoe.safeGuard();
			System.out.println(shoe.brand);
			System.out.println(shoe.cost);
		} else {
			System.out.println("Data is null");
		}
	}
	
}
