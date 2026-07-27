package overloading;

public class ElectricityBillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill eb=new ElectricityBill();
		System.out.println(eb.calculateBill(100));
		System.out.println(eb.calculateBill(100, 50));
		System.out.println(eb.calculateBill(100, 50, 10));
	}

}
