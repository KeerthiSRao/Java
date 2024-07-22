class Number
{
public static void main(String [] args)
{
	System.out.println("running main in Number");
	numberType(25);
}
public static void numberType(int random)
{
	System.out.println("running numberType in Number");
	System.out.println("The given number is : "+random);
	if(random %2 == 0)
	{
		System.out.println("The given number is even");
	}
	else{
		System.out.println("The given number is odd");
	}
}
}
