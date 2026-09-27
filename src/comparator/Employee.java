package comparator;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private int salary;
	
	public Employee(int empId,String empName,int salary) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.empId-e.empId;
	}
	
	public String toString() {
		return 
	}
}
