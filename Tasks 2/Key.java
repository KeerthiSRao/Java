class Key
{
	double weight;
	String brand;
	
	public Key(double weight, String brand)
	{
		System.out.println("Created Key");
		this.weight=weight;
		this.brand=brand;
	}
	
	public void screen()
	{
		System.out.println("Weight : "+weight);
		System.out.println("Brand : "+brand);
	}
	
}