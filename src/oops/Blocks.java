package oops;

public class Blocks {
	int id;
	String name; 
	static String institute="Code Gnan";
	
	static {
		System.out.println("Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}
	 
	{
		System.out.println("Instance Block 1");
		
	}
	
	{
		System.out.println("Instance Block 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blocks bk1=new Blocks();
		
		bk1.id=101;
		bk1.name="vignesh";
		Blocks bk2=new Blocks();
		
		bk2.id=101;
		bk2.name="vignesh";
		System.out.println("ID: "+bk1.id +" Name: "+bk1.name+" Institute: "+institute);
		System.out.println("ID: "+bk2.id+" Name: "+bk2.name+" Institute: "+institute);
	}

}
