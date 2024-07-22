class IndiaCountry
{

public static double price(String item)
{
System.out.println("Running pricein IndiaCountry");
System.out.println("the item is:"+item);
if(item=="dilkush")
{
return 444;
}
if(item=="puffs")
{
return 50;
}
if(item=="samosa")
{
return 120;
}
if(item=="champakali")
{
return 577;
}
if(item=="puri")
{
return 478;
}
return 0;
}
public static String produerName(String movieName)
{
System.out.println("my favorite movie is gaja");
System.out.println("the movieName is:"+movieName);
if(movieName=="Gaja")
{
return "darshan";
}
if(movieName=="Nagarahavu")
{
return "Shylaja";
}
if(movieName=="SSE")
{
return "Rakshith Shetty";
}
if(movieName=="SHPS")
{
return "Rishabh Shetty";
}
if(movieName=="Devil")
{
return "Vijay";
}
return "Not Found";
}
public static String country(double code)
{
System.out.println("india is my country");
System.out.println("the code is:"+code);
if(code==577222)
{
return "Shimoga";
}
if(code==577722)
{
return "Sagara";
}
if(code==577282)
{
return "Davanagere";
}
if(code==577252)
{
return "Banglore";
}
if(code==577227)
{
return "Shikaripura";
}
return "not found";
}
public static void main(String [] args)
{
System.out.println("main mathod running");
String movie=India.produerName("Gaja");
System.out.println("the movie is:"+movie);
String movie1=India.produerName("Nagarahavu");
System.out.println("the movie is:"+movie1);
String movie2=India.produerName("SSE");
System.out.println("the movie is:"+movie2);
String movie3=India.produerName("SHPS");
System.out.println("the movie is:"+movie3);
String movie4=India.produerName("Devil");
System.out.println("the movie is:"+movie4);
String movie5=India.produerName("Sarathi");
System.out.println("movie:"+movie5);

System.out.println("main mathod running");
String value=India.country(577222);
System.out.println("the country is:"+value);
String value1=India.country(577922);
System.out.println("the country is:"+value1);
String value2=India.country(577722);
System.out.println("the country is:"+value2);
String value3=India.country(577282);
System.out.println("the country is:"+value3);
String value4=India.country(577252);
System.out.println("the country is:"+value4);
String value5=India.country(577227);
System.out.println("Value:"+value5);

System.out.println("main mathod running");
double ref=India.price("dilkush");
System.out.println("the item is:"+ref);
double ref1=India.price("puffs");
System.out.println("the item is:"+ref1);
double ref2=India.price("samosa");
System.out.println("the item is:"+ref2);
double ref3=India.price("puri");
System.out.println("the item is:"+ref3);
double ref4=India.price("biryani");
System.out.println("the item is:"+ref4);
double ref5=India.price("pongal");
System.out.println("item:"+ref5);

	
}

}