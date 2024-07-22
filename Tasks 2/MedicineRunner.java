class MedicineRunner
{
	public static void main(String [] values)
	{
		if(values.length==4)
		{
			String name=values[0];
			String manDate=values[1];
			String price=values[2];
			String quantity=values[3];
			
		int mfDate= Integer.parseInt(manDate);
		double prices= Double.parseDouble(price);
		int quantities= Integer.parseInt(quantity);
		
		Medicine.medicineInfo(name,mfDate,prices,quantities);
			
		}
		else {
			System.out.println("Need 4 values");
		}
		
		
	}
	
}