class Train
{
   public static void book(String source,String destination)
    {
		System.out.println("Method with 2 parameters");
	   System.out.println("Source : "+source);
	   System.out.println("Destination : "+destination);
    }
	
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("Method with 3 parameters");
	   System.out.println("Source: "+source);
	   System.out.println("Destination : "+destination);
	   System.out.println("Quantity : "+quantity);
	}
	
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("Method with 4 parameters");
	   System.out.println("Source : "+source);
	   System.out.println("Destination : "+destination);
	   System.out.println("Quantity : "+quantity);
	   System.out.println("Price : "+price);
	}
	
	public static void cancel(int ticketNo)
	{
		System.out.println("Method with 1 parameter");
       System.out.println("TicketNo : "+ticketNo);	 	   
	}
	
	public static void cancel(String source,String destination)
    {
		System.out.println("Method with 2 parameters");
	   System.out.println("Source : "+source);
	   System.out.println("Destination : "+destination);
    }

	
}