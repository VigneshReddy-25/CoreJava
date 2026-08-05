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
