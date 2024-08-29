package com.xworkz.datatypes2.things;

public class Mansi {

	public void smell(Perfume perfume) {
		if(perfume!=null) {
			System.out.println("Created smell");
			perfume.mudrana();
		}else {
			System.out.println("Perfume is null");
		}
	}
	
}
