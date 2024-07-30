class FruitRunner
{

	String fruit;
	double cost;
	int quantity;
	
	
	FruitRunner()
	{
		System.out.println("Created FruitRunner");
		
	}
	

	
	public static void main(String[] args)
	{
		System.out.println("start main in FruitRunner");
		
		FruitRunner fruitRunner=new FruitRunner();
		String ref1=fruitRunner.fruit;
		double ref2=fruitRunner.cost;
		int ref3=fruitRunner.quantity;
		
		fruitRunner.fruit="Watermelon";
		fruitRunner.cost=50;
		fruitRunner.quantity=1;
		
		System.out.println("Fruit : "+fruitRunner.fruit);
		System.out.println("Cost : "+fruitRunner.cost);
		System.out.println("Quantity : "+fruitRunner.quantity);

		fruitRunner.fruit="Muskmelon";
		fruitRunner.cost=60;
		fruitRunner.quantity=2;
		
		System.out.println("Updated Fruit : "+fruitRunner.fruit);
		System.out.println("Updated Cost : "+fruitRunner.cost);
		System.out.println("Updated Quantity : "+fruitRunner.quantity);

		
		
		
		System.out.println("end main in FruitRunner");

	}	
	
	
	
	
	
	
	
}

