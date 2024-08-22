package com.xworkz.bike;

public class BikeRunner {

	public static void main(String[] args) {

		System.out.println("Running main in bike runner");
		Bikes bike=new Bikes();
		bike.store("KTM");
		bike.store("GTR");
		bike.store("PULSAR");
		bike.store("GENESIS");
		bike.store("SPLENDER");
		bike.store("ACTIVA");
		bike.store("PEPT");
		
		
		bike.mudrana();
	}

}
