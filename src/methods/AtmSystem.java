package methods;
import java.util.*;
public class AtmSystem {

	double Balance=20000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		AtmSystem atm=new AtmSystem();
		System.out.println("1. Balance\n2. Deposit\n3. Withdrawal\n0. Exit");
		int choice=1;
		while(choice!=0) {
		choice=sc.nextInt();
		switch(choice) {
			case 1:
				atm.checkBalance();
				break;
			case 2: 
				double deposit=sc.nextDouble();
				atm.deposite(deposit);
				break;
			case 3:
				System.out.println("Enter the amount to withdraw");
				double withdrawal=sc.nextDouble();
				atm.withdraw(withdrawal);
				break;
			case 0:
				System.out.println("Enter 0 to Exit");
			
		}
		}
	}

	public void checkBalance() {
		System.out.println(Balance);
	}
	public void deposite(double deposite) {
		Balance+=deposite;
		System.out.println(Balance);
	}
	public void withdraw(double withdraw) {
		if(Balance>= withdraw) {
			Balance-=withdraw;
			System.out.println(Balance);
		}
		else System.out.println("Insufficient Balance");
	}
}
