package com.xworkz.save;

import com.xworkz.data.SideDishData;

public class SideDishSave {

	
	SideDishData[] dish=new SideDishData[5];
	private int index;
	
	public void save(SideDishData dishes)
	{
		System.out.println("Saved SideDish");
		this.dish[this.index]=dishes;
		index++;
	}
	
	public void display()
	{
		for(SideDishData ref:dish)
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
