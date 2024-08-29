package com.xworkz.datatypes2.runner;

import com.xworkz.datatypes2.things.Kavya;
import com.xworkz.datatypes2.things.Mansi;
import com.xworkz.datatypes2.things.Namratha;
import com.xworkz.datatypes2.things.Perfume;
import com.xworkz.datatypes2.things.Rao;

public class PerfumeRunner {

	public static void main(String[] args) {
		
		Rao rao=new Rao();
		rao.spray();
		
		Mansi mansi=new Mansi();
		Perfume perfume=new Perfume("Victoria's Secret",550,"Spray");
		mansi.smell(perfume);
		
		Kavya kavya=new Kavya();
		kavya.longLasting();
		
		Namratha namratha=new Namratha();
		namratha.flavor();
		
	}
	
}
