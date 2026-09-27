package Inheritance;
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

