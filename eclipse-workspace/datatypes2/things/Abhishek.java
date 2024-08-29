package com.xworkz.datatypes2.things;

public class Abhishek {

	WashingMachine washingMachine=new WashingMachine("LG","Automatic",10);
	
	public void waterLevel() {
		if(washingMachine!=null) {
			System.out.println("Created water level");
			washingMachine.rinse();
			washingMachine.show();
		}else {
			System.out.println("WashingMachine is null");
		}
	}
}
