package com.xworkz.runner;

import com.xworkz.data.MarketData;
import com.xworkz.save.MarketDataSave;

public class MarketRunner {

	public static void main(String[] args) {

		MarketDataSave value=new MarketDataSave();
		value.display();
		MarketData market1=new MarketData("Vegetable", "Sagar");
		market1.mudrana();
		MarketData market2=new MarketData("Fruits", "Shimoga");
		market2.mudrana();
		MarketData market3=new MarketData("Fish", "Davanagere");
		market3.mudrana();
		MarketData market4=new MarketData("ARMC", "Sagar");
		market4.mudrana();
		MarketData market5=new MarketData("Flower", "Banglore");
		market5.mudrana();
		
		
		
	}

}
