class Paint
{
	public static void brand(String name)
	{
	System.out.println("Method with 1 parameter");
	System.out.println("Brand of the paint is : "+name );
	
	}
	public static void brand(String name, String color)
	{
		System.out.println("Method with 2 parameters");
		System.out.println("Brand of the paint is : "+name );
		System.out.println("Color of the paint is : "+color );

	
	}
	public static void brand(String name, int price)
	{
		System.out.println("Method with 2 parameters");
		System.out.println("Brand of the paint is : "+name );
		System.out.println("Price of the paint is : "+price );

	
	}
	public static void brand(String color, String type, int price)
	{
			System.out.println("Method with 3 parameters");
			System.out.println("Color of the paint is : "+color );
			System.out.println("Type of the paint is : "+type );
			System.out.println("Price of the paint is : "+price );

	
	}
	
	
}
