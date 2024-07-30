class ClawRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in ClawRunner");
		
		Claw claw=new Claw();
		int ref=claw.price;
		String ref1=claw.color;
		
		ref=60;
		ref1="Red";
		
		System.out.println("Type : "+claw.type);
		System.out.println("Price : "+ref);
		System.out.println("color : "+ref1);
		
		System.out.println("Start main in ClawRunner");
	}
}