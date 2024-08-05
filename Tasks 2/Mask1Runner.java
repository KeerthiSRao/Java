class Mask1Runner
{
	public static void main(String[] args)
	{
		
		Mask1 mask=new Mask1();
		System.out.println("the name is"+mask.cost);
		System.out.println("the name is"+mask.size);
		System.out.println("the name is"+mask.material);
		System.out.println("==================================");
		
		Mask1 mask1=new Mask1(220);
		System.out.println("the name is"+mask1.cost);
		System.out.println("the name is"+mask1.size);
		System.out.println("the name is"+mask1.material);
		System.out.println("==================================");
		
		Mask1 mask2=new Mask1('M');
		System.out.println("the name is"+mask2.cost);
		System.out.println("the name is"+mask2.size);
		System.out.println("the name is"+mask2.material);
		System.out.println("==================================");
		
		Mask1 mask3=new Mask1("polyster");
		System.out.println("the name is"+mask3.cost);
		System.out.println("the name is"+mask3.size);
		System.out.println("the name is"+mask3.material);
		System.out.println("==================================");
		
		Mask1 mask4=new Mask1(100,'L',"cotton");
		System.out.println("the name is"+mask4.cost);
		System.out.println("the name is"+mask4.size);
		System.out.println("the name is"+mask4.material);
		System.out.println("==================================");
		
		Mask1 mask5=new Mask1(450,'S');
		System.out.println("the name is"+mask5.cost);
		System.out.println("the name is"+mask5.size);
		System.out.println("the name is"+mask5.material);
	}
}