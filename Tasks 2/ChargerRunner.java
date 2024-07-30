class ChargerRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in ChargerRunner");
	
	Charger charger=new Charger();
	String ref=charger.brand;
	int ref1=charger.price;
	
	ref="MI";
	ref1=850;
	System.out.println("Brand : "+ref);
	System.out.println("Price : "+ref1);
	System.out.println("color : "+charger.color);
	
	System.out.println("End main in ChargerRunner");

	}
}