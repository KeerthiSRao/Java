class WrapperRunner
{
	public WrapperRunner()
	{
		System.out.println("Created WrapperRunner");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("start main in WrapperRunner");
		
		WrapperRunner wrapperRunner1= new WrapperRunner();
		WrapperRunner wrapperRunner2= new WrapperRunner();
		WrapperRunner wrapperRunner3= new WrapperRunner();
		WrapperRunner wrapperRunner4= new WrapperRunner();
		WrapperRunner wrapperRunner5= new WrapperRunner();

		System.out.println("end main in WrapperRunner");
	}
}