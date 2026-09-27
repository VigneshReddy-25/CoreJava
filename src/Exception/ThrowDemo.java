package Exception;

public class ThrowDemo {

	public static void check(int age) {
		try {
			if(age<18) {
				throw new IllegalArgumentException("Not valid age");
			}
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
			throw e;
		}
		
		System.out.println("Eligible for vote");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			check(21);
			check(12);
		}catch(Exception e) {
			System.out.println("You are not eligible for voting");
			System.out.println("Because your age is less than 18");
		}
		System.out.println("It is successfully Executed");
	}

}
