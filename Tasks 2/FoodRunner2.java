class FoodRunner2
{

	String item;
	double cost;
	int quantity;
	
	
	FoodRunner2()
	{
		System.out.println("Created FoodRunner2");
		
	}
	

	
	public static void main(String[] args)
	{
		System.out.println("start main in FoodRunner2");
		
		FoodRunner2 foodRunner=new FoodRunner2();
		String ref1=foodRunner.item;
		double ref2=foodRunner.cost;
		int ref3=foodRunner.quantity;
		
		foodRunner.item="Maggie";
		foodRunner.cost=24;
		foodRunner.quantity=1;
		
		System.out.println("Item : "+foodRunner.item);
		System.out.println("Cost : "+foodRunner.cost);
		System.out.println("Quantity : "+foodRunner.quantity);

		foodRunner.item="Dosa";
		foodRunner.cost=60;
		foodRunner.quantity=2;
		
		System.out.println("Updated Item : "+foodRunner.item);
		System.out.println("Updated Cost : "+foodRunner.cost);
		System.out.println("Updated Quantity : "+foodRunner.quantity);

		
		
		
		System.out.println("end main in FoodRunner2");

	}	
	
	
	
	
	
	
	
}

