class SpeakerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in SpeakerRunner");
		
		
		Speaker speaker=new Speaker("JBL");
		speaker.cost=1500;
		speaker.setSize("Medium");
		speaker.display();
		
		
		System.out.println("End main in SpeakerRunner");
		
	}
}