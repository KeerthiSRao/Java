class ForestRunner
{
public static void main(String [] forest)
	{
		System.out.println("running main in InfoRunner");
		if(forest.length==4)
		{
		String name=forest[0];
		String area=forest[1];
		String establishedYear=forest[2];
		String state=forest[3];

		System.out.println("Name :"+name);
		System.out.println("Area :"+area);
		System.out.println("Established Year :"+establishedYear);
		System.out.println("State :"+state);
		
		}
		else{
		System.out.println("Need 4 vales");
		}
		}

}