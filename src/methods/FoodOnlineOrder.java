package methods;
import java.util.*;
public class FoodOnlineOrder {

	int orderId;
    String customerName;
    String restaurantName;
    String foodItem;
    int quantity;
    double pricePerItem;
    
    public FoodOnlineOrder(int orderId, String customerName, String restaurantName, String foodItem, int quantity,double PricePerItem) {
    	this.orderId=orderId;
    	this.customerName=customerName;
    	this.restaurantName=restaurantName;
    	this.foodItem=foodItem;
    	this.quantity=quantity;
    	this.pricePerItem=PricePerItem;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOnlineOrder foo1=new FoodOnlineOrder(101, "Vignesh", "Taj", "Biryani", 2, 160);
		FoodOnlineOrder foo2 = new FoodOnlineOrder(102, "Rahul", "Domino's", "Pizza", 2, 650);
        FoodOnlineOrder foo3 = new FoodOnlineOrder(103, "Priya", "KFC","Burger", 2, 200);
        FoodOnlineOrder foo4 = new FoodOnlineOrder(104, "Amit", "Biryani House", "Chicken Biryani", 3, 350);
		
		foo1.finalBill();
		foo2.finalBill();
		foo3.finalBill();
		foo4.finalBill();
	}
	
	public double totalBill() {
		return quantity*pricePerItem;
		
	}
	
	public double applyDiscount(double bill) {
		if(bill>1000) bill=bill-(bill*0.15);
		return bill;
		
	}
	
	public double deliveryCharges(double discount) {
		if(discount<500) return 50;
		return 0;
	}
	
	public void finalBill() {

	    double bill = totalBill();
	    double discount = applyDiscount(bill);
	    double delivery = deliveryCharges(discount);
	    double finalBill = discount + delivery;

	    System.out.println("\n----------------------------------");
	    System.out.println("Order ID         : " + orderId);
	    System.out.println("Customer Name    : " + customerName);
	    System.out.println("Restaurant Name  : " + restaurantName);
	    System.out.println("Food Item        : " + foodItem);
	    System.out.println("Quantity         : " + quantity);
	    System.out.println("Price per Item   : ₹" + pricePerItem);
	    System.out.println("Total Bill       : ₹" + bill);

	    if (bill > 1000) {
	        System.out.println("Discount (15%)   : ₹" + (bill - discount));
	    } else {
	        System.out.println("Discount         : ₹0");
	    }

	    System.out.println("Delivery Charge  : ₹" + delivery);
	    System.out.println("Final Bill       : ₹" + finalBill);
	}

}
