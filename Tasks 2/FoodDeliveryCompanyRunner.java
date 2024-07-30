class FoodDeliveryCompanyRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in FoodDeliveryCompanyRunner");
		
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		String ref1=foodDeliveryCompany.company;
		String ref2=foodDeliveryCompany.item;
		double ref3=foodDeliveryCompany.cost;
		
		foodDeliveryCompany.company="Zomato";
		foodDeliveryCompany.item="Pastry";
		foodDeliveryCompany.cost=200;
		
		System.out.println("Company : "+foodDeliveryCompany.company);
		System.out.println("Item : "+foodDeliveryCompany.item);
		System.out.println("Cost : "+foodDeliveryCompany.cost);

		
		
		
		System.out.println("end main in FoodDeliveryCompanyRunner");

	}	
	
	
	
	
	
	
	
}
