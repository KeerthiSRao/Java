class Mask
{
	String brand;
	int price;
	String color;
	
	Mask()
	{
		System.out.println("Created Mask");
		
	}
	
	Mask(String brand)
	{
		System.out.println("Created Mask");
		
		this.brand=brand;
		System.out.println("Brand : "+brand);
	}
	
	Mask(String brand, int price)
	{
		System.out.println("Created Mask");
		
		this.brand=brand;
		this.price=price;
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);

	}
	
	Mask(int price, String color)
	{
		System.out.println("Created Mask");
		
		this.price=price;
		this.color=color;
		System.out.println("Price : "+price);
		System.out.println("Color : "+color);	
	}
}