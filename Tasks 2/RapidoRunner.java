class RapidoRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in RapidoRunner");
		
		Rapido rapido=new Rapido();
		String ref1=rapido.type;
		double ref2=rapido.cost;
		int ref3=rapido.person;
		
		rapido.type="Cab";
		rapido.cost=250;
		rapido.person=1;
		
		System.out.println("Type : "+rapido.type);
		System.out.println("Cost : "+rapido.cost);
		System.out.println("Person : "+rapido.person);

		
		
		
		System.out.println("end main in RapidoRunner");

	}	
	
	
	
	
	
	
	
}
