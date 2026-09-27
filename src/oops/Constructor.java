package oops;

public class Constructor {
	
	
//Default Constructor
//	String name;
//	int age;
//	public Constructor() {
//		
//	}
//	
//	public  void display() {
//		System.out.println("Name: "+name);
//		System.out.println("Age: "+age);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Constructor cr=new Constructor();
//		cr.display();
//	}
//

	
	

//Default Constructor
//	String name;
//	int age;
//	public Constructor() {
//		name="vignesh";
//		age=21;
//	}
//	
//	public  void display() {
//		System.out.println("Name: "+name);
//		System.out.println("Age: "+age);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Constructor s1=new Constructor();
//		System.out.println("s1 object: ");
//		s1.display();
//		System.out.println();
//		
//		Constructor s2=new Constructor();
//		System.out.println("s2 object: ");
//		s2.display();
//		System.out.println();
//		
//		Constructor s3=new Constructor();
//		System.out.println("s3 object: ");
//		s3.display();
//	}
	
	
	
	
	
//parameterised Constructor
//	String name;
//	int age;
//	public Constructor(String sname,int sage) {
//		name=sname;
//		age=sage;
//	}
//	
//	public  void display() {
//		System.out.println("Name: "+name);
//		System.out.println("Age: "+age);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Constructor s1=new Constructor("vigensh",21);
//		System.out.println("s1 object: ");
//		s1.display();
//		System.out.println();
//		
//		Constructor s2=new Constructor("shiva",21);
//		System.out.println("s2 object: ");
//		s2.display();
//		System.out.println();
//		
//		Constructor s3=new Constructor("loknath",21);
//		System.out.println("s3 object: ");
//		s3.display();
//	}
	
	
	
	
//Copy Constructor
	String name;
	int age;
	public Constructor(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public Constructor(Constructor obj1) {
		name=obj1.name;
		age=obj1.age;
	}
	
	public  void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor s1=new Constructor("vignesh",21);
		System.out.println("s1 object: ");
		s1.display();
		System.out.println();
		
		Constructor s2=new Constructor("shiva",21);
		System.out.println("s2 object: ");
		s2.display();
		System.out.println();
		
		Constructor s3=new Constructor("loknath",21);
		System.out.println("s3 object: ");
		s3.display();
	}

}