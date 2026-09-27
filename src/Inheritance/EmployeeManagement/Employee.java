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
