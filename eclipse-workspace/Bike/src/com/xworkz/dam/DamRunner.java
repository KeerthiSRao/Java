package com.xworkz.dam;

public class DamRunner {

	public static void main(String[] args) {
		System.out.println("Running main in bike runner");
		Dam dams=new Dam();
		dams.store("Ambligola dam");
		dams.store("Arkavathi dam");
		dams.store("Bhadra dam");
		dams.store("Dharma dam");
		dams.store("Gerusoppa dam");
		dams.store("Krishnaraja Sagar dam");
		dams.store("Linganmakki dam");
		
		
		dams.mudrana();
	}

}
