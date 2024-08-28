package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Anna;
import com.xworkz.datatypes.things.Elsa;
import com.xworkz.datatypes.things.Snow;
import com.xworkz.datatypes.things.Snowfall;

public class SnowRunner {

	public static void main(String[] args) {

		Snowfall snowfall1=new Snowfall();
		snowfall1.cold();
		
		Elsa elsa=new Elsa();
		elsa.olaf();
		
		Anna anna=new Anna();
		Snow snow1=new Snow();
		anna.freeze(snow1);
		
	}

}
