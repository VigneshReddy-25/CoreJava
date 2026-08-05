package Inheritance;
public class EmployeeManagement {

	public static void main(String args[]) {
		Developer dev=new Developer(101,"Vignesh",60000,"Java","Employee Management");
		Tester test =new Tester(102,"Ravi",40000,"Selenium","Selenium");
		System.out.println("Developer Details: ");
		dev.displayDetails();
		System.out.println("Testing Details: ");
		test.displayDetails();
	}
}
