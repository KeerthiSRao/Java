package com.xworkz.things.runner;

import com.xworkz.things.Government;
import com.xworkz.things.StateGovernment;
import com.xworkz.things.CentrlGovernmnet;

public class GovernmentRunner {

	public static void main(String[] args) {

		System.out.println("Running main in TrainRunner");

		StateGovernment govt1=new StateGovernment("Karnataka",224);
		Government govt2=new StateGovernment("Tamil Nadu",234);
		govt1.mudrana();
		govt2.mudrana();
		
		CentrlGovernmnet govt3=new CentrlGovernmnet(" Lal Krishna Advani ", "Amit Shah");
		Government govt4=new CentrlGovernmnet("Amit Shah","Rajnath Singh");
		govt3.mudrana();
		govt4.mudrana();
		
	}

}
