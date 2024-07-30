class SprayRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in SprayRunner");
	
	Spray spray=new Spray();
	String ref=spray.name;
	int ref1=spray.price;
	
	ref="Volini";
	ref1=350;
	System.out.println("Brand : "+ref);
	System.out.println("Price : "+ref1);
	System.out.println("Type : "+spray.type);
	
	System.out.println("End main in SprayRunner");

	}
}