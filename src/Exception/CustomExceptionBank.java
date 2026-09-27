package Exception;

public class CustomExceptionBank {
	static int bal=1000;
	
	static void withdrawal(int amount) throws InsufficientBalanceException {
		if(amount>bal) {
			throw new InsufficientBalanceException("Balance is less than withdrawal");
		}
		System.out.println("Withdrawal Sucessfull....");
	}
	
	static void deposit(int amt) {
		if(amt<0) {
			throw new InvalidException("ur amount is not valid");
			
		}
		System.out.println("depoit successsfull...");
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		try {
//			withdrawal(10000);
//		} catch (InsufficientBalanceException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Transaction Failed");
//			System.out.println("Retry again....");
//		}
//		
//	}

	public static void main(String[] args) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		deposit(-90);
		withdrawal(10000);
		System.out.println("Retry again....");
		
		
	}
}
