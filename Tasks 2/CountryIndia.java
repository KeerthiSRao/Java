class CountryIndia
{
	public static void states(String[] ref)
	{
		System.out.println("running states in country");
		for (int stateNames=ref.length - 1;stateNames>=0;stateNames--)
	{
		System.out.println("State is : "+ref[stateNames]);
		
	}
	}
	public static void pincode(int [] code)
	{
		System.out.println("Running pincode in MyCountry");
		for (int codeNum =code.length-1 ;codeNum>=0;codeNum--)
		{
			System.out.println("Pincode is : "+code[codeNum]);
		}
	}
	public static void primeMinister(String [] minister)
	{
		System.out.println("Running primeMinister in MyCountry");
		for (int pMinister=minister.length-1;pMinister>=0;pMinister--)
		{
			System.out.println("Minister is : "+minister[pMinister]);
		}

	}
public static void cabinetMinister(String [] ministers)
	{
		System.out.println("Running cabinetMinister in MyCountry");
		for (int cMinisters=ministers.length-1;cMinisters>=0;cMinisters--)
		{
			System.out.println("Minister is : "+ministers[cMinisters]);
		}

	}
	public static void parties(String [] political)
	{
		System.out.println("Running parties in MyCountry");
		for (int politicalPart=political.length-1;politicalPart>=0;politicalPart--)
		{
			System.out.println("Party is : "+political[politicalPart]);
		}

	}
	
}