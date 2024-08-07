class GanaviRunner
{
	public static void main(String[] args)
	{
		Clip clip=new Clip("Red","Claw");
		Ganavi ganavi=new Ganavi("Ganavi@gmail.com",clip);
		ganavi.screen();
		
		Clip clip1=new Clip("Green","Heart");
		Ganavi ganavi1=new Ganavi("Ganavi123@gmail.com",clip1);
		ganavi1.screen();
	}
}