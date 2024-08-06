class Company1
{
	int id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer1=new SoftwareEngineer("Keerthi",2,"Software Engineer",35000);
	SoftwareEngineer softwareEngineer2=new SoftwareEngineer();
	
	public Company1()
	{
		System.out.println("Created Company1");
	}
	
	public Company1(int id, String name, String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	
	public void screen()
	{
		System.out.println("Id :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Location :"+this.location);
		this.softwareEngineer1.screen();
	}
}