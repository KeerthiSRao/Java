package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Hat;
import com.xworkz.datatypes.things.Rajkumar;
import com.xworkz.datatypes.things.Upendra;
import com.xworkz.datatypes.things.Yash;

public class HatRunner {

	public static void main(String[] args) {

		Upendra upendra = new Upendra();
		upendra.wear();

		Yash yash = new Yash();
		Hat hat = new Hat();
		yash.tear(hat);

		Rajkumar rajkumar = new Rajkumar();
		rajkumar.hat = new Hat();// or create new hat with ref hat2 and assign here(init using ref)
		rajkumar.fold();
	}

}
