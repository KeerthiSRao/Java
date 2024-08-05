class RocketRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in Rocket Runner");
		
		Rocket rocket=new Rocket(12500);
		rocket.fuelCapacity=100;
		rocket.setNoOfThrusters(3);
		rocket.display();		
		
		
		System.out.println("Start main in Rocket Runner");
		
	}
}