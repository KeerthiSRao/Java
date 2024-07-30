class JeanRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in JeanRunner");
	
	Jean jean=new Jean();
	String ref=jean.brand;
	int ref1=jean.price;
	
	ref="Denim";
	ref1=850;
	System.out.println("Brand : "+ref);
	System.out.println("Price : "+ref1);
	System.out.println("Type : "+jean.type);
	
	System.out.println("End main in JeanRunner");

	}
}