package Exception;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("try block");
			int num=10/0;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("it is finally block");
		}
	}

}
