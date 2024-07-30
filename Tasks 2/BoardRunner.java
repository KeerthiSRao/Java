class BoardRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in BoardRunner");
		
		Board board=new Board("Black","Small","White Chalk");
		System.out.println("color : "+board.color);
		System.out.println("Size : "+board.size);
		System.out.println("write : "+board.write);
		
		Board board1=new Board("Green","Small","White Chalk");
		System.out.println("color : "+board1.color);
		System.out.println("Size : "+board1.size);
		System.out.println("write : "+board1.write);

		Board board2=new Board("White","Small","Blue Marker");
		System.out.println("color : "+board2.color);
		System.out.println("Size : "+board2.size);
		System.out.println("write : "+board2.write);

		Board board3=new Board("Black","Large","White Chalk");
		System.out.println("color : "+board3.color);
		System.out.println("Size : "+board3.size);
		System.out.println("write : "+board3.write);

		Board board4=new Board("Green","Large","White Chalk");
		System.out.println("color : "+board4.color);
		System.out.println("Size : "+board4.size);
		System.out.println("write : "+board4.write);

		Board board5=new Board("Black","Large","Blue Marker");
		System.out.println("color : "+board5.color);
		System.out.println("Size : "+board5.size);
		System.out.println("write : "+board5.write);

		Board board6=new Board("Green","Medium","White Chalk");
		System.out.println("color : "+board6.color);
		System.out.println("Size : "+board6.size);
		System.out.println("write : "+board6.write);

		Board board7=new Board("Black","Large","White Chalk");
		System.out.println("color : "+board7.color);
		System.out.println("Size : "+board7.size);
		System.out.println("write : "+board7.write);

		Board board8=new Board("White","Medium","Blue Marker");
		System.out.println("color : "+board8.color);
		System.out.println("Size : "+board8.size);
		System.out.println("write : "+board8.write);

		Board board9=new Board("Green","Large","White Chalk");
		System.out.println("color : "+board9.color);
		System.out.println("Size : "+board9.size);
		System.out.println("write : "+board9.write);

		
		
		
		System.out.println("End main in CapRunner");

	}
}