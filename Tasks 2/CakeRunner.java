class CakeRunner
{
	public CakeRunner()
	{
		System.out.println("Created CakeRunner");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("start main in CakeRunner");
		
		CakeRunner cakeRunner1= new CakeRunner();
		CakeRunner cakeRunner2= new CakeRunner();
		CakeRunner cakeRunner3= new CakeRunner();
		CakeRunner cakeRunner4= new CakeRunner();
		CakeRunner cakeRunner5= new CakeRunner();

		System.out.println("end main in CakeRunner");
	}
}