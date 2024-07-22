class JuiceRunner
{
	public static void main(String [] values)
	{
		if(values.length==5)
		{
			String name=values[0];
			String brand=values[1];
			String flavor=values[2];
			String price=values[3];
			String quantity=values[4];
			
			double juicePrice=Double.parseDouble(price);
			int juiceQuantity=Integer.parseInt(quantity);
			
			Juice.juiceInfo(name,brand,flavor,juicePrice,juiceQuantity);
			
		}
		else{
			System.out.println("Need 5 values");
		}
	}
}