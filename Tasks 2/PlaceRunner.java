class PlaceRunner
{

	String place;
	String state;
	String country;
	
	
	PlaceRunner()
	{
		System.out.println("Created PlaceRunner");
		
	}
	

	
	public static void main(String[] args)
	{
		System.out.println("start main in PlaceRunner");
		
		PlaceRunner placeRunner=new PlaceRunner();
		String ref1=placeRunner.place;
		String ref2=placeRunner.state;
		String ref3=placeRunner.country;
		
		placeRunner.place="Kedarnath";
		placeRunner.state="Uttarakhand";
		placeRunner.country="India";
		
		System.out.println("Place : "+placeRunner.place);
		System.out.println("State : "+placeRunner.state);
		System.out.println("Country : "+placeRunner.country);

		placeRunner.place="Ayodhya";
		placeRunner.state="Uttar Pradesh";
		placeRunner.country="India";
		
		System.out.println("Updated Place : "+placeRunner.place);
		System.out.println("Updated State : "+placeRunner.state);
		System.out.println("Updated Country : "+placeRunner.country);

		
		
		
		System.out.println("end main in PlaceRunner");

	}	
	
	
	
	
	
	
	
}

