package Exception;

public class ExceptionPropogation {

	public static void m1() {
		m2();
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
		int num=10/0;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		}
		catch(ArithmeticException e) {
			System.out.println("Zero Division Exception");
			System.out.println(e.getMessage());
		}
	}

}
