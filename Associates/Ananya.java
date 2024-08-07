class Ananya
{
	long mobile;
	Knife knife;
	
	public Ananya(long mobile,Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
	}
	
	public void screen()
	{
		System.out.println("Mobile : "+mobile);
		knife.screen();
	}
}