package com.xworkz.things.runner;

import com.xworkz.things.SuperMarket;
import com.xworkz.things.Market;
import com.xworkz.things.OnlineMarket;

public class MarketRunner {

	public static void main(String[] args) {
		System.out.println("Running main in TrainRunner");

		SuperMarket market1=new SuperMarket("Sagar Market","Sagar");
		Market market2=new SuperMarket("Shimoga Market","Shimoga");
		market1.mudrana();
		market2.mudrana();
		
		OnlineMarket market3=new OnlineMarket(8, "Taalguppa");
		Market market4=new OnlineMarket(10,"Sagar");
		market3.mudrana();
		market4.mudrana();
	}

}
