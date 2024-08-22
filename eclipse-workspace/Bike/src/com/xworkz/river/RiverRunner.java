package com.xworkz.river;

public class RiverRunner {

	public static void main(String[] args) {
		System.out.println("Running main in bike runner");
		River rivers=new River();
		rivers.store("Bhadra");
		rivers.store("Tunga");
		rivers.store("Tungabhadra");
		rivers.store("Sharavathi");
		rivers.store("Kaveri");
		rivers.store("Krishna");
		rivers.store("Godavari");
		
		
		rivers.mudrana();
	}

}
