class PaperRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in PaperRunner");
		
		Paper paper=new Paper("White");
		paper.setThickness(24);
		paper.size='M';
		paper.display();
		
		System.out.println("Start main in PaperRunner");
		
	}
}