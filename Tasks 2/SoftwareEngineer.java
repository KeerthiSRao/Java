class SoftwareEngineer
{
	String name;
	int experience;
	String designation;
	double salary;
	
	public SoftwareEngineer()
	{
		System.out.println("Created SoftwareEngineer");
	}
	
	public SoftwareEngineer(String name, int experience, String designation, double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void screen()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Experience : "+this.experience);
		System.out.println("Designation : "+this.designation);
		System.out.println("Salary : "+this.salary);
		
	}
}