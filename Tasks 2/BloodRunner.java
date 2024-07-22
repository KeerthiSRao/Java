class BloodRunner
{
	public static void main(String [] args)
	{
		System.out.println("Running main in bloodRunner");
		String group = Blood.group();
		System.out.println("The blood group is : "+group);
		
		String personName = Blood.personName();
		System.out.println("The personName is : "+personName);
		
		double cost = Blood.cost();
		System.out.println("The cost is : "+cost);
		
		String hospitalTested = Blood.hospitalTested();
		System.out.println("The hospitalTested is : "+hospitalTested);
		
		boolean sick = Blood.sick();
		System.out.println("Sick? : "+sick);
		
		boolean donate = Blood.donate();
		System.out.println("donate? : "+donate);


		}
}