class Projector
{
	String company="Epson";
	String type;
	String color;
	double weight;
	
	Projector(String type)
	{
		this.type=type;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("Company : "+this.company);
		System.out.println("Type : "+this.type);
		System.out.println("Color : "+this.color);
		System.out.println("Weight : "+this.weight);
		
	}
}