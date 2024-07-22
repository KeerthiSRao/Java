class PotatoRunner
{
	public static void main (String [] args)
	{
		System.out.println("running main in PotatoRunner");
		fries();
		chips();
	}
	static void fries()
	{
		System.out.println("running fries in PotatoRunner");
		chips();
	}
	static void chips()
	{
		System.out.println("running chips in PotatoRunner");
		fries();
	}
}