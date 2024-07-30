class Application1Runner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in Application1Runner");
		
		Application1 application=new Application1();
		String ref1=application.name;
		double ref2=application.storage;
		String ref3=application.type;
		
		application.name="HiTV";
		application.storage=56.4;
		application.type="App";
		
		System.out.println("Name : "+application.name);
		System.out.println("Storage : "+application.storage);
		System.out.println("Type : "+application.type);

		application.name="Instagram";
		application.storage=60;
		application.type="Application";
		
		System.out.println("Updated Name : "+application.name);
		System.out.println("Updated Storage : "+application.storage);
		System.out.println("Updated Type : "+application.type);

		
		
		
		System.out.println("end main in Application1Runner");

	}	
	
	
	
	
	
	
	
}
