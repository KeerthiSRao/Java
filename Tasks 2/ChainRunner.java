class ChainRunner
{
	public static void main(String [] args)
	{
		System.out.println("Running main in ChainRunner");
		double carat = Chain.carat();
		System.out.println("The carat is : "+carat);
		
		double costPerGram = Chain.costPerGram();
		System.out.println("The costPerGram is : "+costPerGram);
		
		String type = Chain.type();
		System.out.println("The type is : "+type);
		
		boolean quality = Chain.quality();
		System.out.println("quality good? : "+quality);
		
		int quantity = Chain.quantity();
		System.out.println("quantity in grams is : "+quantity);

		double wastage = Chain.wastage();
		System.out.println("The wastage in % is : "+wastage);
		
		double serviceCharge = Chain.serviceCharge();
		System.out.println("The serviceCharge in % is : "+serviceCharge);
		
		double gst = Chain.gst();
		System.out.println("The gst in % is : "+gst);

		}
}