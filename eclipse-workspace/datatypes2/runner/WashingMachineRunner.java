package com.xworkz.datatypes2.runner;

import com.xworkz.datatypes2.things.Abhishek;
import com.xworkz.datatypes2.things.Bhoomika;
import com.xworkz.datatypes2.things.Laxmi;
import com.xworkz.datatypes2.things.Megha;
import com.xworkz.datatypes2.things.Nayana;
import com.xworkz.datatypes2.things.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {

		Megha megha=new Megha();
		megha.wash();
		
		Laxmi laxmi=new Laxmi();
		WashingMachine washingMachine=new WashingMachine("Philips","Automatic",10);
		laxmi.spin(washingMachine);
		
		Abhishek abhishek=new Abhishek();
		abhishek.waterLevel();
		
		Bhoomika bhoomika=new Bhoomika();
		bhoomika.wash();
		
		Nayana nayana=new Nayana();
		nayana.hang();
		
	}

}
