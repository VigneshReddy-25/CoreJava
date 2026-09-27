package Abstract;

public class AccountMain {
	
	public static void main(String arga[]) {
		Account sa=new SavingsAccount(1001,10000);
		Account ca=new CurrentAccount(1001,10000);
		System.out.println(sa.deposit(10000) ? "Deposit Successful" : "Deposit failed");
		System.out.println(ca.deposit(10000)? "Deposit Successful" : "Deposit failed");
		System.out.println(sa.withdraw(20000)  ? "Withdraw Successfull": "Withdraw failed");
		System.out.println(ca.withdraw(25000)? "Withdraw Successfull": "Withdraw failed");
	}
	
}
