package com.xworkz.datatypes2.things;

public class Godse {

	public Gun shoot() {
		System.out.println("Created shoot");
		Gun gun=new Gun("M1911","USA","Pistol");
		gun.display();
		return gun;
	}
}
