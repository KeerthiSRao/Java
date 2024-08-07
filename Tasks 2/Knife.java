class Knife
{
	double weight;
	double height;
	
	public Knife(double weight, double height)
	{
		this.weight=weight;
		this.height=height;
	}
	
	public void screen()
	{
		System.out.println("Weight : "+weight);
		System.out.println("Height : "+height);
		
	}
}