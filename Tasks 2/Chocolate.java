class Chocolate
{
		String brand;
		double price;
		String flavour="Roasted almond";
		char size;
		
		Chocolate(String brand)
		{
			this.brand=brand;
		}
		
		public void setPrice(double price)
		{
			this.price=price;
		}
		
		public void display()
	{
		System.out.println("Brand : "+this.brand);
		System.out.println("Price : "+this.price);
		System.out.println("Flavor : "+this.flavour);
		System.out.println("Size : "+this.size);
		
	}
}