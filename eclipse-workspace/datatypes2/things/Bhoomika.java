package com.xworkz.datatypes2.things;

public class Bhoomika {

	public WashingMachine wash() {
		System.out.println("Created wash");
		WashingMachine washingMachine=new WashingMachine("Sony","Automatic",5);
		washingMachine.show();
		return washingMachine;
	}
	
}
