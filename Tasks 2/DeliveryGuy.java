class DeliveryGuy
{
public static void deliver(String item)
{
	System.out.println("Running deliver in DeliveryGuy");
	DeliveryVehicle.deliver(item,"FIXED");

}
}