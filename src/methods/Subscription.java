package methods;

public class Subscription {

	static int userID;
	static String userName;
	static String platformName;
	static String subscriptionPlan;
	static double monthlyPrice;
	static int numberofMonths;
	static double Price;
	static double discount;
	static double totalPrice;

	public Subscription(int userID, String userName, String platformName, String subscriptionPlan, double monthlyPrice, int numberofMonths) {
		this.userID=userID;
		this.userName=userName;
		this.platformName=platformName;
		this.subscriptionPlan=subscriptionPlan;
		this.monthlyPrice=monthlyPrice;
		this.numberofMonths=numberofMonths;
	}
	public static double subscriptionAmount(double monthlyPrice,int numberofMonths) {
		return monthlyPrice * numberofMonths;
	}
	public static double discount(double price,int numberofMonths) {
	    if(numberofMonths == 12)
	        return price - (price * 0.20);

	    return price;
	}
	public static double Gst(double dis) {
		return dis + (dis * 0.18);
		
	}
	public static void display() {
		Price= subscriptionAmount(monthlyPrice,numberofMonths);
		discount=discount(Price, numberofMonths);
		totalPrice=Gst(discount);
		System.out.println("User Id: "+userID);
		System.out.println("User Name: "+userName);
		System.out.println("Total Price: "+totalPrice);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subscription sub1 = new Subscription(101,"Vignesh","Amazon Prime", "Premium", 399, 12);
		
		sub1.display();
		System.out.println("**********************************");
		Subscription sub2 = new Subscription(102,"Shiva","Netflix", "Premium", 399, 6);
		
		sub2.display();
		System.out.println("**********************************");
		Subscription sub3 = new Subscription(103,"Loknath","Disney + Hotstar", "Premium", 399, 3);
		
		
		
		sub3.display();
	}

}
