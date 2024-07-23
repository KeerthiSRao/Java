class AutoRunner
{
	public AutoRunner()
	{
		System.out.println("Created AutoRunner");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("start main in AutoRunner");
		
		AutoRunner autoRunner1= new AutoRunner();
		AutoRunner autoRunner2= new AutoRunner();
		AutoRunner autoRunner3= new AutoRunner();
		AutoRunner autoRunner4= new AutoRunner();
		AutoRunner autoRunner5= new AutoRunner();

		System.out.println("end main in AutoRunner");
	}
}