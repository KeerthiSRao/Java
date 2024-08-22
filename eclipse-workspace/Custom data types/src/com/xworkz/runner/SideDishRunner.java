package com.xworkz.runner;

import com.xworkz.data.SideDishData;
import com.xworkz.save.SideDishSave;

public class SideDishRunner {

	public static void main(String[] args) {

		SideDishSave sides=new SideDishSave();
		sides.display();
		SideDishData dish1=new SideDishData("Potato Chips", 25, "Chips");
		dish1.mudrana();
		SideDishData dish2=new SideDishData("Banana Chips", 10, "Chips");
		dish2.mudrana();
		SideDishData dish3=new SideDishData("Maggie", 25, "Snack");
		dish3.mudrana();
		SideDishData dish4=new SideDishData("Finger chips", 25, "Fries");
		dish4.mudrana();
		SideDishData dish5=new SideDishData("Pickle", 25, "Saltydish");
		dish5.mudrana();
		
	}

}
