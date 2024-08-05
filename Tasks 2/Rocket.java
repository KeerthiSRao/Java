class Rocket
{
	String country="India";
	double speed;
	double fuelCapacity;
	int noOfThrusters;
	
	Rocket(double speed)
	{
		this.speed=speed;
	}
	
	public void setNoOfThrusters(int noOfThrusters)
	{
		this.noOfThrusters=noOfThrusters;
		
	}
	
	public void display()
	{
		System.out.println("Country : "+this.country);
		System.out.println("Speed : "+this.speed);
		System.out.println("Fuel capacity : "+this.fuelCapacity);
		System.out.println("No Of Thrusters : "+this.noOfThrusters);
		
	}
}