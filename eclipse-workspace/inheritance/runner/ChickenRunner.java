package com.xworkz.inheritance.runner;
import com.xworkz.inheritance.Chicken;
import com.xworkz.inheritance.ChickenBiryani;

public class ChickenRunner {

	public static void main(String[] args) {

		ChickenBiryani chicken=new ChickenBiryani();
		chicken.chickenDetails("Chicken", 150, 5, true, 'F', "ChickenKabab", 250, 1, "Nandini farm", 450);
		
		Chicken chicken1=new ChickenBiryani();
		chicken1.chickenDetails("Chicken", 350, 10, true, 'M', "ChickenBiryani", 450, 2, "Akshaya farm", 650);
	}
	}


