package com.xworkz.things.runner;

import com.xworkz.things.MetroTrain;
import com.xworkz.things.SubUrbanTrain;
import com.xworkz.things.Train;
public class TrainRunner {

	
	public static void main(String[] args) {
		System.out.println("Running main in TrainRunner");

		MetroTrain metro1=new MetroTrain(74124,"Sagar","Shimoga");
		Train metro2=new MetroTrain(764821,"Shimoga","Sagar");
		metro1.mudrana();
		metro2.mudrana();
		
		SubUrbanTrain metro3=new SubUrbanTrain("Banglore", "Taalguppa");
		Train metro4=new SubUrbanTrain("Shimoga","Sagar");
		metro3.mudrana();
		metro4.mudrana();
		
		

	}

}
