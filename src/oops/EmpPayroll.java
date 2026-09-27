package oops;

public class EmpPayroll {
	int empId;
	String empName;
	String department;
	int salary;
	public EmpPayroll(int empId, String empName, String department, int salary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}

	public void display() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Department: "+department);
		System.out.println("Employee Salary: "+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpPayroll e1=new EmpPayroll(101,"vignesh","Development",50000);
		e1.display();
		System.out.println();
		EmpPayroll e2=new EmpPayroll(102,"ravi","HR",350000);
		e2.display();
		System.out.println();
		EmpPayroll e3=new EmpPayroll(103,"kiran","Teating",40000);
		e3.display();
		
	}

}
