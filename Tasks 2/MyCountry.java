class MyCountry
{
	public static void states(String[] ref)
	{
		System.out.println("running states in country");
		for (int stateNames=0;stateNames<ref.length;stateNames++)
	{
		System.out.println("State is : "+ref[stateNames]);
		
	}
	}
	public static void pincode(int [] code)
	{
		System.out.println("Running pincode in MyCountry");
		for (int codeNum =0;codeNum<code.length;codeNum++)
		{
			System.out.println("Pincode is : "+code[codeNum]);
		}
	}
	public static void primeMinister(String [] minister)
	{
		System.out.println("Running primeMinister in MyCountry");
		for (int pMinister=0;pMinister<minister.length;pMinister++)
		{
			System.out.println("Minister is : "+minister[pMinister]);
		}

	}
public static void cabinetMinister(String [] ministers)
	{
		System.out.println("Running cabinetMinister in MyCountry");
		for (int cMinisters=0;cMinisters<ministers.length;cMinisters++)
		{
			System.out.println("Minister is : "+ministers[cMinisters]);
		}

	}
	public static void parties(String [] political)
	{
		System.out.println("Running parties in MyCountry");
		for (int politicalPart=0;politicalPart<=political.length;politicalPart++)
		{
			System.out.println("Party is : "+political[politicalPart]);
		}

	}
	
}










