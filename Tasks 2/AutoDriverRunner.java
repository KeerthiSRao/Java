class AutoDriverRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in AutoDriverRunner");
		
		AutoDriver autoDriver=new AutoDriver();
		String ref1=autoDriver.name;
		double ref2=autoDriver.weight;
		int ref3=autoDriver.age;
		
		autoDriver.name="Raam";
		autoDriver.weight=65.2;
		autoDriver.age=45;
		
		System.out.println("Name : "+autoDriver.name);
		System.out.println("Weight : "+autoDriver.weight);
		System.out.println("Age : "+autoDriver.age);

		
		
		
		System.out.println("end main in AutoDriverRunner");

	}	
	
	
	
	
	
	
	
}
