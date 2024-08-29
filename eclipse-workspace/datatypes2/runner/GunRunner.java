package com.xworkz.datatypes2.runner;
 
import com.xworkz.datatypes2.things.DBoss;
import com.xworkz.datatypes2.things.Godse;
import com.xworkz.datatypes2.things.Gun;
import com.xworkz.datatypes2.things.Police;
import com.xworkz.datatypes2.things.Soldier;

public class GunRunner {

	public static void main(String[] args) {

		Soldier soldier=new Soldier();
		soldier.army();
		
		Police police=new Police();
		Gun gun=new Gun("Blackhawk","USA","Revolver");
		police.protect(gun);
		
		DBoss dboss=new DBoss();
		dboss.jail();
		
		Godse godse=new Godse();
		godse.shoot();
		
	}

}
