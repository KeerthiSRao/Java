class KeybunchRunner
{
	public static void main(String[] args)
	{
		System.out.println("Created KeybunchRunner");
		
		Key key=new Key(58,"Aluminium");
		Keybunch keybunch=new Keybunch("Black metal",key);
		keybunch.screen();
		
		Key key1=new Key(27,"Orbit Key");
		Keybunch keybunch1=new Keybunch("Metal",key1);
		keybunch1.screen();
		
	}
}