class State
{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity();
	CapitalCity capitalCity1=new CapitalCity("Banglore",2854754);
	
	public State()
	{
		System.out.println("Created State");
	}
	
	public State(String name, String language)
	{
		this.name=name;
		this.language=language;
		
	}
	public void screen()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Language : "+this.language);
		capitalCity1.screen();
	}
	
}