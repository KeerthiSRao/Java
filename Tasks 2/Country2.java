class Country2
{
	String name;
	String continent;
	State state=new State();
	State state1=new State("Karnataka","Kannada");
	
	public Country2()
	{
		System.out.println("Created Country2");
	}
	
	public Country2(String name, String continent)
	{
		this.name=name;
		this.continent=continent;
	}
	
	public void screen()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Continent : "+this.continent);
		state1.screen();
	}
}