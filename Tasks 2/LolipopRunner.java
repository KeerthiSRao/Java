class LolipopRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in LolipopRunner");
	
	Lolipop lolipop=new Lolipop();
	String ref=lolipop.name;
	int ref1=lolipop.price;
	
	ref="Alpenlibe";
	ref1=5;
	System.out.println("Name : "+ref);
	System.out.println("Price : "+ref1);
	System.out.println("Flavor : "+lolipop.flavor);
	
	System.out.println("End main in LolipopRunner");

	}
}