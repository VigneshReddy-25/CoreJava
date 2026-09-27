package Exception;

public class FinallyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(test());
		
	}
	public static int test() {
		try {
			int num=10/0;
			System.out.println("it is try block");
			return 1;
		}
		catch(ArithmeticException e) {
			System.out.println("catch block");
			return 2;
		}
		finally {
			System.out.println("finally block");

		}
	}

}
