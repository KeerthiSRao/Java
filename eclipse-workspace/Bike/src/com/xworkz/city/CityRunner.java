package com.xworkz.city;

public class CityRunner {

	public static void main(String[] args) {
		System.out.println("Running main in bike runner");
		City cities=new City();
		cities.store("Shimoga");
		cities.store("Davanagere");
		cities.store("Banglore");
		cities.store("Dharwad");
		cities.store("Mumbai");
		cities.store("Delhi");
		cities.store("Pune");
		
		
		cities.mudrana();
	}

}
