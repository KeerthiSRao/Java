class BMTCRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in BMTCRunner");
		
		BMTC bMTC=new BMTC();
		String ref1=bMTC.source;
		String ref2=bMTC.destination;
		int ref3=bMTC.price;
		
		bMTC.source="Malleshwaram";
		bMTC.destination="Bashyam Circle";
		bMTC.price=50;
		
		System.out.println("Source : "+bMTC.source);
		System.out.println("destination : "+bMTC.destination);
		System.out.println("Price : "+bMTC.price);

		
		
		
		System.out.println("end main in BMTCRunner");

	}	
	
	
	
	
	
	
	
}
