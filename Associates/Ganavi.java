class Ganavi
{
	String email;
	Clip clip;
	
	public Ganavi(String email, Clip clip)
	{
		this.email=email;
		this.clip=clip;
	}
	
	public void screen()
	{
		System.out.println("Email : "+email);
		clip.screen();
	}
}