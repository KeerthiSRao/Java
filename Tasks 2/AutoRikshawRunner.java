class AutoRikshawRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in AutoRikshawRunner");
		
		AutoRikshaw autoRikshaw=new AutoRikshaw();
		String ref1=autoRikshaw.color;
		double ref2=autoRikshaw.cost;
		int ref3=autoRikshaw.quantity;
		
		autoRikshaw.color="Green";
		autoRikshaw.cost=12000;
		autoRikshaw.quantity=1;
		
		System.out.println("Color : "+autoRikshaw.color);
		System.out.println("Cost : "+autoRikshaw.cost);
		System.out.println("Quantity : "+autoRikshaw.quantity);

		
		
		
		System.out.println("end main in AutoRikshawRunner");

	}	
	
	
	
	
	
	
	
}
