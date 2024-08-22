package com.xworkz.save;

import com.xworkz.data.MarketData;

public class MarketDataSave {

	MarketData[] market=new MarketData[5];
	private int index;
	
	public void save(MarketData markets)
	{
		System.out.println("Saved markets");
		this.market[this.index]=markets;
		index++;
	}
	
	public void display()
	{
		for(MarketData ref:market)
		{
			if(ref!=null)
			{
				ref.mudrana();
			}else {
				System.out.println("Data is null");
			}
		}
	}
	
	
}
