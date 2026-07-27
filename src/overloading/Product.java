package overloading;

public class Product {
	String prod_name;
	double price;
	String category;
	public Product(String prod_name) {
		this.prod_name=prod_name;
	}
	public Product(String prod_name,double price) {
		this.prod_name=prod_name;
		this.price=price;
	}
	public Product(String prod_name,double price, String category) {
		this.prod_name=prod_name;
		this.price=price;
		this.category=category;
	}
	public void display() {
		System.out.println("Product Name: "+prod_name);
		System.out.println("Price: "+price);
		System.out.println("Category: "+category);
		System.out.println("*******************************************");
	}
	
	public static void main(String args[]) {
		Product pd1 = new Product("IQOO Z6 PRO");
	    Product pd2 = new Product("IQOO Z6 PRO", 25000);
	    Product pd3 = new Product("IQOO Z6 PRO", 25000, "Mobile");
	    pd1.display();
	    pd2.display();
	    pd3.display();
		
	}
}
