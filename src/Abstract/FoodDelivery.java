package Abstract;

abstract class Restaurant {
	String restaurantName;
	String location;
	Restaurant(String restaurantName, String location){
		this.restaurantName=restaurantName;
		this.location=location;
	}
	public void displayDetails() {
		System.out.println("Restaurant Name: "+restaurantName);
		System.out.println("Location: "+location);
	}
	public void receiveOrder() {
		System.out.println("Order received Successfully.......");
	}
	public abstract void prepareFood();
	
}
class PizzaRestaurant extends Restaurant{
	PizzaRestaurant(String name,String location){
		super(name,location);
	}

	@Override
	public void prepareFood() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Pizza...");
	}
	
}


class BiryaniRestaurant extends Restaurant{
	BiryaniRestaurant(String name,String location){
		super(name,location);
	}

	@Override
	public void prepareFood() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Biryani...");
	}
	
}

class Bakery extends Restaurant{
	Bakery(String name,String location){
		super(name,location);
	}

	@Override
	public void prepareFood() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Cake...");
	}
	
}

public class FoodDelivery{
	public static void main(String aeg[]) {
		Restaurant pr = new PizzaRestaurant("Pizza Hut", "JNTU");
		pr.displayDetails();
		pr.receiveOrder();
		pr.prepareFood();
		
		Restaurant br = new BiryaniRestaurant("ALL Joint Mandi", "Kurnool");
		br.displayDetails();
		br.receiveOrder();
		br.prepareFood();
		
		Restaurant b = new Bakery("Golden Bakery", "JNTU");
		b.displayDetails();
		b.receiveOrder();
		b.prepareFood();
	}
}