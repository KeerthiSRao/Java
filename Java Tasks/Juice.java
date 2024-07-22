class Juice
{
public static void main (String [] args) 
{
System.out.println("running main in juice");
fruit();
}
public static void fruit()
{
	System.out.println("running fruit in juice");
	nuts();
}
public static void nuts()
{
	System.out.println("running nuts in juice");
	sugar();
}
public static void sugar()
{
	System.out.println("running sugar in juice");
	ice();
}
public static void ice()
{
	System.out.println("running ice in juice");
	drink();
}
public static void drink()
{
	System.out.println("running drink in juice");
}

}