package Exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10,deno=0,rem=0;
		try {
			rem=num/deno;
			System.out.println(rem);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Completed");
	}

}
