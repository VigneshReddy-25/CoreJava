package oops;

public class Student {
	int id;
	String name;
	static String institute="CodeGnan";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student();
		stu1.id=101;
		stu1.name="Vignesh";
		
		
		Student stu2=new Student();
		stu2.id=102;
		stu2.name="Vignesh";
		System.out.println("ID is: "+stu1.id+" Name of the Student is: "+ stu1.name+ " Institute Name is: "+institute);;
		System.out.println("ID is: "+stu2.id+" Name of the Student is: "+ stu2.name);
	}

}
