class Gadgets
{
	 public static double getPrice(String name)
   {
	    String [] values={"hp","dell","Mobile","Charger","laptop","Watch","Fan","TV","Refrigerator","Ac"};

	   
	      for(int i=0;i<values.length;i++){
	   if(values[i]==name&&name=="dell")
	   {
		   double price=25000;
		   return price;
	   }
	    else if(values[i]==name&& name=="Fan")
	   {
		   double price1=1000;
		   return price1;
	   }
	   else if(values[i]==name&& name=="hp")
	   {
		   double price2=35000;
		   return price2;
	   }else if(values[i]==name&& name=="Mobile")
	   {
		   double price3=25000;
		   return price3;
	   }else if(values[i]==name&& name=="Charger")
	   {
		   double price4=25000;
		   return price4;
	   }else if(values[i]==name&& name=="laptop")
	   {
		   double price5=95000;
		   return price5;
	   }else if(values[i]==name&& name=="Watch")
	   {
		   double price6=1500;
		   return price6;
	   }else if(values[i]==name&& name=="TV")
	   {
		   double price7=50000;
		   return price7;
	   }else if(values[i]==name&& name=="Refrigerator")
	   {
		   double price8=25000;
		   return price8;
	   }else if(values[i]==name&& name=="Ac")
	   {
		   double price9=55000;
		   return price9;
	   }
		  }
		  return 0;
	   
	   
   
   
   
 }
}