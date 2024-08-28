package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Divya;
import com.xworkz.datatypes.things.Harshitha;
import com.xworkz.datatypes.things.Omkar;
import com.xworkz.datatypes.things.Shoe;

public class ShoeRunner {

	
			public static void main(String[] args) {

				Divya divya=new Divya();
				divya.enhance();
				
				Omkar omkar = new Omkar();
				Shoe shoe = new Shoe();
				omkar.tear(shoe);

				Harshitha harshitha = new Harshitha();
				harshitha.shoe = new Shoe();
				harshitha.run();				
			}
	}


