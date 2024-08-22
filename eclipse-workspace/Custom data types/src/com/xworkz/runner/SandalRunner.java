package com.xworkz.runner;

import com.xworkz.data.SandalData;
import com.xworkz.save.SandalDataSave;

public class SandalRunner {

	public static void main(String[] args) {

		SandalDataSave sandalStore=new SandalDataSave();
		sandalStore.display();
		SandalData sandal1=new SandalData("Bata", 'M', 650,"Black");
		sandal1.mudrana();
		SandalData sandal2=new SandalData("Walkaroo", 'S', 450,"Beige");
		sandal2.mudrana();
		SandalData sandal3=new SandalData("Adidas", 'M', 980,"Black");
		sandal3.mudrana();
		SandalData sandal4=new SandalData("Nike", 'M', 1400,"White");
		sandal4.mudrana();
		SandalData sandal5=new SandalData("Puma", 'M', 1350,"Blue");
		sandal5.mudrana();
		
	}

}
