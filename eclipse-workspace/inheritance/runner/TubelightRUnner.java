package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.Bulb;
import com.xworkz.inheritance.Tubelight;

public class TubelightRUnner {

	public static void main(String[] args) {

		Bulb bulb1=new Tubelight();
		bulb1.light("Philips");
		
		
		Tubelight tube1=new Tubelight();
		tube1.light("Sony");
		
	}

}
