class MedicineRunner1
{

	String name;
	double cost;
	int quantity;
	
	
	MedicineRunner1()
	{
		System.out.println("Created MedicineRunner1");
		
	}
	

	
	public static void main(String[] args)
	{
		System.out.println("start main in MedicineRunner1");
		
		MedicineRunner1 medicineRunner=new MedicineRunner1();
		String ref1=medicineRunner.name;
		double ref2=medicineRunner.cost;
		int ref3=medicineRunner.quantity;
		
		medicineRunner.name="Dolo 650";
		medicineRunner.cost=25;
		medicineRunner.quantity=1;
		
		System.out.println("Name : "+medicineRunner.name);
		System.out.println("Cost : "+medicineRunner.cost);
		System.out.println("Quantity : "+medicineRunner.quantity);

		medicineRunner.name="Paracetemol";
		medicineRunner.cost=20;
		medicineRunner.quantity=2;
		
		System.out.println("Updated Name : "+medicineRunner.name);
		System.out.println("Updated Cost : "+medicineRunner.cost);
		System.out.println("Updated Quantity : "+medicineRunner.quantity);

		
		
		
		System.out.println("end main in MedicineRunner1");

	}	
	
	
	
	
	
	
	
}

