package com.xworkz.datatypes2.things;

public class WashingMachine {


		private String brand;
		private String type;
		private double capacity;
		
		public WashingMachine(){
			System.out.println("Created Washing Machine");
		}

		public WashingMachine(String brand, String type, double capacity) {
			super();
			this.brand = brand;
			this.type = type;
			this.capacity = capacity;
		}
		
		public void rinse() {
			System.out.println("Created rinse");
		}
		
		public void show() {
			System.out.println("Brand : "+brand);
			System.out.println("Type : "+type);
			System.out.println("Capacity : "+capacity);

		}
		
	}


