class CandyRunner
{

	String name;
	double cost;
	int quantity;
	
	
	CandyRunner()
	{
		System.out.println("Created CandyRunner");
		
	}
	

	
	public static void main(String[] args)
	{
		System.out.println("start main in CandyRunner");
		
		CandyRunner candyRunner=new CandyRunner();
		String ref1=candyRunner.name;
		double ref2=candyRunner.cost;
		int ref3=candyRunner.quantity;
		
		candyRunner.name="Alpenlibe";
		candyRunner.cost=2;
		candyRunner.quantity=1;
		
		System.out.println("Name : "+candyRunner.name);
		System.out.println("Cost : "+candyRunner.cost);
		System.out.println("Quantity : "+candyRunner.quantity);

		candyRunner.name="Just Jelly";
		candyRunner.cost=1;
		candyRunner.quantity=2;
		
		System.out.println("Updated Name : "+candyRunner.name);
		System.out.println("Updated Cost : "+candyRunner.cost);
		System.out.println("Updated Quantity : "+candyRunner.quantity);

		
		
		
		System.out.println("end main in CandyRunner");

	}	
	
	
	
	
	
	
	
}

