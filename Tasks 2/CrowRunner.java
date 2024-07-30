class CrowRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in CrowRunner");
	
	Crow crow=new Crow();
	int ref=crow.legs;
	int ref1=crow.wings;
	
	ref=2;
	ref1=2;
	System.out.println("Legs : "+ref);
	System.out.println("Wings : "+ref1);
	System.out.println("Color : "+crow.color);
	
	System.out.println("End main in CrowRunner");

	}
}