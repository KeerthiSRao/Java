class MountainRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in MountainRunner");
	
	Mountain mountain=new Mountain();
	String ref=mountain.place;
	int ref1=mountain.visit;
	
	ref="Agumbe";
	ref1=5;
	System.out.println("Place : "+ref);
	System.out.println("Visit : "+ref1);
	System.out.println("Country : "+mountain.country);
	
	System.out.println("End main in MountainRunner");

	}
}