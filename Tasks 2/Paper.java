class Paper
{
	double thickness;
	char size;
	boolean quality=true;
	String color;

	Paper(String color)
	{
		this.color=color;
	}
	
	public void setThickness(double thickness)
	{
		this.thickness=thickness;
	}
	
	public void display()
	{
		System.out.println("Thickness : "+this.thickness);
		System.out.println("Size : "+this.size);
		System.out.println("Quality : "+this.quality);
		System.out.println("Color : "+this.color);
		
	}
}