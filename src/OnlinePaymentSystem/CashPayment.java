package OnlinePaymentSystem;

public class CashPayment extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment of 5000 made using Cash...");
		
	}
	public static void main(String[] args) {
		CashPayment p1=new CashPayment();
		CashPayment.hi();
	}
}
