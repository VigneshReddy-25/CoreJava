package Exception;

public class ExceptionHierarichy {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		try {
//			int num=10/0;
//			System.out.println(num);
//			
//		}
//		catch(Exception e) {
//			System.out.println("Exception Class");
//			
//		}
//		//Invalid
//		catch(ArithmeticException e) {
//			System.out.println("Artithmetic Exception");
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num=10/0;
			System.out.println(num);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Artithmetic Exception");
		}
		catch(Exception e) {
			System.out.println("Exception Class");
		}
		
	}

}
