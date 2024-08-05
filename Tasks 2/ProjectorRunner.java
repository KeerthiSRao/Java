class ProjectorRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in ProjectorRunner");

		Projector projector=new Projector("Digital Projector");
		projector.setColor("White");
		projector.weight=3;
		projector.display();

		System.out.println("Start main in ProjectorRunner");
		
	}
}