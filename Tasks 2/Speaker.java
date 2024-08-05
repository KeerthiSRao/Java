class Speaker
{
	String brand;
	String size;
	double cost;
	double output=104.7;
	
	Speaker(String brand)
	{
		this.brand=brand;
	}
	
	public void setSize(String size)
	{
		this.size=size;
	}
	
	public void display()
	{
		System.out.println("Brand : "+this.brand);
		System.out.println("Size : "+this.size);
		System.out.println("Cost : "+this.cost);
		System.out.println("Output : "+this.output);
		
	}
}