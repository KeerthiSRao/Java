class Hotel
{
	String name="Ayodhya Hotel";
	Owner owner=new Owner("Chidambar",105,'M');
	Owner owner1=new Owner();
	
	
	public Hotel()
	{
		System.out.println("Created Hotel");
	}
	
	public void screen()
	{
		System.out.println("Owner name :"+name);
		this.owner.screen();
	}
}