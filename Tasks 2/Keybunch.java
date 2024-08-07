class Keybunch
{
	String material;
	Key key;
	
	
	public Keybunch(String material,Key key)
	{
		System.out.println("Created Keybunch");
		this.material=material;
		this.key=key;
	}
	
	public void screen()
	{
		System.out.println("Material : "+material);
		key.screen();
	}
}