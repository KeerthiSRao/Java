package com.xworkz.datatypes2.things;

public class Laxmi {

	public void spin(WashingMachine washingMachine) {
		if(washingMachine!=null) {
		System.out.println("Created spin");
		washingMachine.rinse();
		washingMachine.show();
		}else {
			System.out.println("WashingMachine is null");
		}
	}
}
