package methods;
import java.util.*;

public class FoodOrder {
	static double price;
	static int quantity;
	static double bill;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder fo=new FoodOrder();
		fo.displayMenu();
		fo.calculateBill(quantity,price);
		fo.calculateDiscount(bill);
		fo.printBill();
		
	}
	public void displayMenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Gobi Rice\n2.Noodles\n3.Biryani\n4.parota");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("You have selected Gobi Rice");
				System.out.println("Enter quantity: ");
				quantity=sc.nextInt();
				price=80;
				break;
			case 2:
				System.out.println("You have selected Noodles");
				System.out.println("Enter quantity: ");
				quantity=sc.nextInt();
				price=70;
				break;
			case 3:
				System.out.println("You have selected Biryani");
				System.out.println("Enter quantity: ");
				quantity=sc.nextInt();
				price=160;
				break;
			case 4:
				System.out.println("You have selected Parota");
				System.out.println("Enter quantity: ");
				quantity=sc.nextInt();
				price=100;
				break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	
	public void calculateBill(int quantity,double price) {
		bill=price*quantity;
	}
	
	public void calculateDiscount(double bill) {
		this.bill=bill-(bill*0.10);
	}
	
	public void printBill() {
		System.out.println("The total bill is: "+bill);
	}

}
