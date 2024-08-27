package com.xworkz.inheritance.runner;
import com.xworkz.inheritance.SmartPhone;
import com.xworkz.inheritance.HandPhone;

public class SmartPhoneRunner {

	public static void main(String[] args) {

		SmartPhone phone=new HandPhone();
		phone.mobile("Samsung", "Black", 11000, "Android");
		
		HandPhone phone1=new HandPhone();
		phone1.mobile("Apple", "Blue", 110000, "IOS");
	}

}
