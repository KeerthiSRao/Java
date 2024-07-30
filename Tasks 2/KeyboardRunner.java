class KeyboardRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in KeyboardRunner");
	
	Keyboard keyboard=new Keyboard();
	String ref=keyboard.brand;
	int ref1=keyboard.price;
	
	ref="Dell";
	ref1=450;
	System.out.println("Brand : "+ref);
	System.out.println("Price : "+ref1);
	System.out.println("color : "+keyboard.color);
	
	System.out.println("End main in KeyboardRunner");

	}
}