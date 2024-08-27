package com.xworkz.inheritance.runner;
import com.xworkz.inheritance.Halwa;
import com.xworkz.inheritance.Carrot;

public class HalwaRunner {

	public static void main(String[] args) {
		
		Halwa halwa=new Carrot();
		halwa.taste("Sweet",55, 1);
		
		
		Carrot carrot=new Carrot();
		carrot.taste("Sweet",45,1);
		
	}

}
