class PalaceRunner 
{

		public static void main(String [] palace)
	{
		System.out.println("running main in InfoRunner");
		if(palace.length==4)
		{
		String name=palace[0];
		String location=palace[1];
		String builtBy=palace[2];
		String builtYear=palace[3];

		System.out.println("Name :"+name);
		System.out.println("Location :"+location);
		System.out.println("Built By :"+builtBy);
		System.out.println("Built Year :"+builtYear);
		
		}
		else{
		System.out.println("Need 4 vales");
		}
	}
}