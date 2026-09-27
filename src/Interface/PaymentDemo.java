
package Interface;

import java.util.Scanner;
interface  Payment{
	void pay(double amount);

}

class CreditCard implements Payment{
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid Rs."+amount+" through Credit Card");
	}

}

class UPI implements Payment{
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid Rs."+amount+" through UPI");
	}

}
class Netbanking implements Payment{
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid Rs."+amount+" through Net Banking");
	}

}
class Paypal implements Payment{
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid Rs."+amount+" through Paypal");
	}

}
class Checkout{
	public void payProcess(Payment payment,double amount) {
		payment.pay(amount);
		System.out.println("Payment Successfull..");
	}
}

public class PaymentDemo {

	public static void main(String rags[]) {
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		Checkout co=new Checkout();
		
		Payment payment;
		payment=new CreditCard();
		co.payProcess(payment, amount);
		payment=new UPI();
		co.payProcess(payment, amount);
		payment=new Netbanking();
		co.payProcess(payment, amount);
		payment=new Paypal();
		co.payProcess(payment, amount);
	}
}
