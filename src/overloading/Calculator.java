package overloading;


public class Calculator {

	
	public int add(int a,int b) {
		System.out.println("Int");
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int add(int a,short b) {
		System.out.println("Short");
		return a+b;
	}

}
