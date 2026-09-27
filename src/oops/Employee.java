package oops;

public class Employee {
	int emp_id;
	String emp_name;
	static String company="Code Gnan";
	
	//instance block - executed when the object is created
	{
		System.out.println("Instance Block 1");
	}
	
	//instance block - executed when the object is created
	{
		System.out.println("Instance Block 2");
	}
	
	
	//static block- executed when class is loaded
	static {
		System.out.println("Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}
	 

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1=new Employee();
		
		em1.emp_id=101;
		em1.emp_name="vignesh";
		Employee em2=new Employee();
		
		em2.emp_id=101;
		em2.emp_name="vignesh";
		System.out.println("ID: "+em1.emp_id +" Name: "+em1.emp_name+" Company: "+ company);
		System.out.println("ID: "+em2.emp_id+" Name: "+em2.emp_name+" Company: "+ company);

	}

}
