class CabCompanyRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in CabCompanyRunner");
		
		CabCompany cabCompany=new CabCompany();
		String ref1=cabCompany.name;
		double ref2=cabCompany.cost;
		int ref3=cabCompany.person;
		
		cabCompany.name="Uber";
		cabCompany.cost=250;
		cabCompany.person=1;
		
		System.out.println("Name : "+cabCompany.name);
		System.out.println("Cost : "+cabCompany.cost);
		System.out.println("Person : "+cabCompany.person);

		
		
		
		System.out.println("end main in CabCompanyRunner");

	}	
	
	
	
	
	
	
	
}
