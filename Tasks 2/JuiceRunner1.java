class JuiceRunner1
{

	String fruit;
	double cost;
	int quantity;
	
	
	JuiceRunner1()
	{
		System.out.println("Created JuiceRunner1");
		
	}
	

	
	public static void main(String[] args)
	{
		System.out.println("start main in JuiceRunner1");
		
		JuiceRunner1 juiceRunner=new JuiceRunner1();
		String ref1=juiceRunner.fruit;
		double ref2=juiceRunner.cost;
		int ref3=juiceRunner.quantity;
		
		juiceRunner.fruit="Watermelon";
		juiceRunner.cost=50;
		juiceRunner.quantity=1;
		
		System.out.println("Fruit : "+juiceRunner.fruit);
		System.out.println("Cost : "+juiceRunner.cost);
		System.out.println("Quantity : "+juiceRunner.quantity);

		juiceRunner.fruit="Muskmelon";
		juiceRunner.cost=60;
		juiceRunner.quantity=2;
		
		System.out.println("Updated Fruit : "+juiceRunner.fruit);
		System.out.println("Updated Cost : "+juiceRunner.cost);
		System.out.println("Updated Quantity : "+juiceRunner.quantity);

		
		
		
		System.out.println("end main in JuiceRunner1");

	}	
	
	
	
	
	
	
	
}

