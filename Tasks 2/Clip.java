class Clip
{
	String color;
	String type;
	
	public Clip(String color, String type)
	{
		this.color=color;
		this.type=type;
	}
	
	public void screen()
	{
		System.out.println("Color : "+color);
		System.out.println("Type : "+type);
		
	}
}