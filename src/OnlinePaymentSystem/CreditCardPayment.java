package OnlinePaymentSystem;

public class CreditCardPayment extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment of 5000 made using Credit Card...");
	}
}
