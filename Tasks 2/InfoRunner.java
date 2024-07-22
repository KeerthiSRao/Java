class InfoRunner
{
	public static void main(String [] person)
	{
		System.out.println("running main in InfoRunner");
		if(person.length==4)
		{
		String name=person[0];
		String email=person[1];
		String age=person[2];
		String password=person[3];

		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Age :"+age);
		System.out.println("Password :"+password);
		
		}else{
		System.out.println("Need 4 vales");
		}
	}
	
}