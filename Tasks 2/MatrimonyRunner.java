class MatrimonyRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in MatrimonyRunner");
		
		Matrimony matrimony=new Matrimony();
		String ref1=matrimony.name;
		String ref2=matrimony.gender;
		String ref3=matrimony.type;
		
		matrimony.name="Kannada Matrimony";
		matrimony.gender="Male";
		matrimony.type="Website";
		
		System.out.println("Name : "+matrimony.name);
		System.out.println("Gender : "+matrimony.gender);
		System.out.println("Type : "+matrimony.type);

		matrimony.name="Indian Matrimony";
		matrimony.gender="Female";
		matrimony.type="App";
		
		System.out.println("Updated Name : "+matrimony.name);
		System.out.println("Updated Gender : "+matrimony.gender);
		System.out.println("Updated Type : "+matrimony.type);

		
		
		
		System.out.println("end main in MatrimonyRunner");

	}	
	
	
	
	
	
	
	
}
