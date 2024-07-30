class AirConditionRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in AirConditionRunner");
		
		AirCondition airCondition=new AirCondition();
		String ref1=airCondition.brand;
		double ref2=airCondition.cost;
		int ref3=airCondition.quantity;
		
		airCondition.brand="Phillips";
		airCondition.cost=12000;
		airCondition.quantity=1;
		
		System.out.println("Brand : "+airCondition.brand);
		System.out.println("Cost : "+airCondition.cost);
		System.out.println("Quantity : "+airCondition.quantity);

		
		
		
		System.out.println("end main in AirConditionRunner");

	}	
	
	
	
	
	
	
	
}
