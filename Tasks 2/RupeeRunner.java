class RupeeRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in RupeeRunner");
		
		Rupee rupee=new Rupee();
		String ref1=rupee.currency;
		String ref2=rupee.abbrevation;
		int ref3=rupee.dollar;
		
		rupee.currency="Indian Rupee";
		rupee.abbrevation="INR";
		rupee.dollar=67;
		
		System.out.println("Currency : "+rupee.currency);
		System.out.println("Abbrevation : "+rupee.abbrevation);
		System.out.println("Dollar : "+rupee.dollar);

		
		
		
		System.out.println("end main in RupeeRunner");

	}	
	
	
	
	
	
	
	
}
