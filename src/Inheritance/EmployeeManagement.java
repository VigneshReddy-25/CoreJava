package inheritance;

class Employee{
	private int empId;
	private String empName;
	private double salary;
	Employee(int empId,String empName, double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpName(String  empName) {
		this.empName=empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public void diplayDetails() {
		System.out.println("Employee Id: "+ empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Salary: "+salary);
	}
}

class Developer extends Employee{
	String programmingLanguage;
	String projectName;
	Developer(int empId, String empName, double salary,String programmingLanguage,String projectName) {
		super(empId, empName, salary);
		// TODO Auto-generated constructor stub
		this.programmingLanguage=programmingLanguage;
		this.projectName=projectName;
	}
	@Override
	public void displayDetails() {
		super.diplayDetails();
		System.out.println("Programming Language: "+programmingLanguage);
		System.out.println("Project Name: "+projectName);
		
	}
}

class Tester extends Employee{
	String testingTool;
	String automationType;
	Tester(int empId, String empName, double salary,String testingTool,String automationType) {
		super(empId, empName, salary);
		// TODO Auto-generated constructor stub
		this.automationType=automationType;
		this.testingTool=testingTool;
	}
	@Override
	public void displayDetails() {
		super.diplayDetails();
		System.out.println("Testing Tool: "+ testingTool);
		System.out.println("Automation Type: "+ automationType);
		
	}
	
}
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
