class StadiumRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in StadiumRunner");
	
	Stadium stadium=new Stadium();
	String ref=stadium.name;
	int ref1=stadium.price;
	
	ref="Chinnaswamy";
	ref1=850;
	System.out.println("Brand : "+ref);
	System.out.println("Price : "+ref1);
	System.out.println("color : "+stadium.country);
	
	System.out.println("End main in StadiumRunner");

	}
}