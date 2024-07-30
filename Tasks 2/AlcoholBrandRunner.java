class AlcoholBrandRunner
{

	String brand;
	double cost;
	int quantity;
	
	
	AlcoholBrandRunner()
	{
		System.out.println("Created AlcoholBrandRunner");
		
	}
	

	
	public static void main(String[] args)
	{
		System.out.println("start main in AlcoholBrandRunner");
		
		AlcoholBrandRunner alcoholBrandRunner=new AlcoholBrandRunner();
		String ref1=alcoholBrandRunner.brand;
		double ref2=alcoholBrandRunner.cost;
		int ref3=alcoholBrandRunner.quantity;
		
		alcoholBrandRunner.brand="Jack Daneils";
		alcoholBrandRunner.cost=450;
		alcoholBrandRunner.quantity=1;
		
		System.out.println("Brand : "+alcoholBrandRunner.brand);
		System.out.println("Cost : "+alcoholBrandRunner.cost);
		System.out.println("Quantity : "+alcoholBrandRunner.quantity);

		alcoholBrandRunner.brand="Magic Momnts";
		alcoholBrandRunner.cost=560;
		alcoholBrandRunner.quantity=2;
		
		System.out.println("Updated Brand : "+alcoholBrandRunner.brand);
		System.out.println("Updated Cost : "+alcoholBrandRunner.cost);
		System.out.println("Updated Quantity : "+alcoholBrandRunner.quantity);

		
		
		
		System.out.println("end main in AlcoholBrandRunner");

	}	
	
	
	
	
	
	
	
}

