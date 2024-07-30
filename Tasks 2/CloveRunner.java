class CloveRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in CloveRunner");
	
	Clove clove=new Clove();
	String ref=clove.taste;
	int ref1=clove.price;
	
	ref="Bitter";
	ref1=250;
	System.out.println("Brand : "+ref);
	System.out.println("Price : "+ref1);
	System.out.println("color : "+clove.color);
	
	System.out.println("End main in CloveRunner");

	}
}