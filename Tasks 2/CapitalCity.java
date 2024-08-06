class CapitalCity
{
	String name;
	double population;
	
	public CapitalCity()
	{
		System.out.println("Created CapitalCity");
	}
	
	public CapitalCity(String name, double population)
	{
		this.name=name;
		this.population=population;
	}
	
	public void screen()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Population :"+this.population);
	}
	
}