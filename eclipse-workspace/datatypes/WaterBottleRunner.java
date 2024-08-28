package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Devu;
import com.xworkz.datatypes.things.Gunashree;
import com.xworkz.datatypes.things.Swetha;
import com.xworkz.datatypes.things.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {

		
			Gunashree bottle = new Gunashree();
			bottle.drink();
			Swetha bottle1 = new Swetha();
			WaterBottle waterBottle = new WaterBottle();
			bottle1.store(waterBottle);
			Devu bottle3 = new Devu();
			bottle3.hold();
		}
	
	}


