class Wednesday
{
	public ststic String country(int code)
	{
		System.out.println("my country");
		System.out.println("codeis:"+code);
		if(code==577553)
		{
			return "shivmogga";
		}
		if(code==577552)
		{
			return "sagara";
		}
		if(code==577555)
		{
			return "shikaripura";
		}
		if(code==577556)
		{
			return "davanagere";
		}
		if(code==577563)
		{
			return "ballery";
		}
		return "not found";
		
	}
		public static double price(String item)
	{
		System.out.println("my item");
		System.out.println("item is:"+item);
		if(item=="champakali")
		{
			return 23;
		}
		if(item=="dosa")
		{
			return 55;
		}
		if(item=="idli")
		{
			return 67;
		}
		if(item=="palav")
		{
			return 77;
		}
		if(item=="avalakki")
		{
			return 80;
		}
		return 0;
	}
	public static String producerName(String movieName)
	{
		System.out.println("my movie");
		System.out.println("item is:"+movieName);
		if(movie=="Kali")
		{
			return "RajMouli";
		}
		if(movie=="Adipurush")
		{
			return "Rakshith Shetty";
		}
		if(movie=="Housefull")
		{
			return "Karan Johar";
		}
		if(movie=="SSE")
		{
			return "Rakhith Shetty";
		}
		if(movie=="SSE2")
		{
			return "Rakshith Shetty";
		}
		return "Not found";
	}
	
	
	public static void main(String [] args)
	{
		System.out.println("print all countrydetails");
		String.value=Wednesday.country(577552);
		System.out.println("shivmogga");
		String.value=Wednesday.country(577553);
		System.out.println("sagara");
		String.value=Wednesday.country(577555);
		System.out.println("shikaripura");
		String.value=Wednesday.country(577556);
		System.out.println("davanagere");
		String.value=Wednesday.country(577563);
		System.out.println("ballery");
		String.value=Wednesday.country(577582);
		System.out.println("Not Founf");
		
		
		String.value=Wednesday.producerName("champakali");
		System.out.println(23);
		String.value=Wednesday.producerName("dosa");
		System.out.println(55);
		String.value=Wednesday.producerName("idli");
		System.out.println(67);
		String.value=Wednesday.producerName("palav");
		System.out.println(77);
		String.value=Wednesday.producerName("avalakki");
		System.out.println(80);
		String.value=Wednesday.producerName("poha");
		System.out.println(0);
		
		
		String.value=Wednesday.country("Kali");
		System.out.println("RajMouli");
		String.value=Wednesday.country("Adipurush");
		System.out.println("Rakshith Shetty");
		String.value=Wednesday.country("Housefull");
		System.out.println("Karan Johar");
		String.value=Wednesday.country("SSE");
		System.out.println("Rakshith Shetty");
		String.value=Wednesday.country("SSE2");
		System.out.println("Rakshith Shetty");
		String.value=Wednesday.country(577552);
		System.out.println("Not Found");
		
		
	}
	
	
}