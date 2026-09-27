package OnlinePaymentSystem;

public class UPIPayment extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment of 5000 made using UPI...");
	}
	
	public static void hi() {
		System.out.println("HI");
	}
}
