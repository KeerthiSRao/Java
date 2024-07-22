class MainRunner
{
public static void main(String [] args)
{
System.out.println("the parameters passed to all values of paint");
Paint.brand("Asian Paints");
Paint.brand("Asian Paints","Blue");
Paint.brand("Asian Paints",250);
Paint.brand("Blue","Acrylic",250);

System.out.println("the parameters passed to all values of train");
Train.book("Sagar","Banglore");
Train.book("Sagar","Banglore",3);
Train.book("Sagara","Banglore",3,2500);
Train.cancel(25876);
Train.cancel("Sagar","Banglore");

System.out.println("the parameters passed to all values of place");
Place.num1("Calm and peaceful");
Place.num1("Calm and peaceful","Not bad but not good");
Place.num1("Calm and peaceful","Not bad but not good",54550);
Place.num1("Calm and peaceful",238);
Place.num1("Calm and peaceful","Not bad but not good",54550,238);

}
}