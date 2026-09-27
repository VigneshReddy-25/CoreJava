package Exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10,deno=2,rem=0;
		String s1=null;
		try {
			System.out.println(s1.length());
			rem=num/deno;
			System.out.println(rem);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

}
