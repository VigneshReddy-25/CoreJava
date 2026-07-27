package overloading;

public class Recharge {

	long mobileNumber;
	double amt;
	String serProvider;
	
	public Recharge(long mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	public Recharge(long mobileNumber,double amt) {
		this.mobileNumber=mobileNumber;
		this.amt=amt;
	}
	public Recharge(long mobileNumber,double amt,String serProvider) {
		this.mobileNumber=mobileNumber;
		this.amt=amt;
		this.serProvider=serProvider;
	}
	
	public void recharge() {
		System.out.println("Recharge Amount : ₹" + amt);
	    System.out.println("Validity        : 28 Days");
	}

	public void recharge(int validity) {
		System.out.println("Recharge Amount : ₹" + amt);
	    System.out.println("Validity        : " + validity + " Days");
	}

	public void recharge(int validity, double cashback) {
	    System.out.println("Recharge Amount : ₹" + amt);
	    System.out.println("Validity        : " + validity + " Days");
	    System.out.println("Cashback        : ₹" + cashback);
	}
    public void displayRechargeDetails() {
        System.out.println("Mobile Number   : " + mobileNumber);
        System.out.println("Recharge Amount : ₹" + amt);
        System.out.println("Service Provider: " + serProvider);
    }
	
}
