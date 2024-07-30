class ClockRunner
{
	public static void main(String[] args)
	{
	System.out.println("Start main in ClockRunner");
	
	Clock clock=new Clock();
	String ref=clock.time;
	int ref1=clock.price;
	
	ref="3 p.m.";
	ref1=980;
	System.out.println("Time : "+ref);
	System.out.println("Price : "+ref1);
	System.out.println("Type : "+clock.type);
	
	System.out.println("End main in ClockRunner");

	}
}