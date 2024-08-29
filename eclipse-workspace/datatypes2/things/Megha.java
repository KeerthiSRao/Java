package com.xworkz.datatypes2.things;

public class Megha {

	public void wash() {
		System.out.println("Created wash");
		WashingMachine washingMachine=new WashingMachine("Havels","Automatic",5);
		washingMachine.rinse();
		washingMachine.show();
	}
	
}
