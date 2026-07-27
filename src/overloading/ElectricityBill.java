package overloading;
public class ElectricityBill {

	public int calculateBill(int units) {
		return units*8;
	}
	public double calculateBill(int units, double serviceCharge) {
		return units * 8 + serviceCharge;
	}
	public double calculateBill(int units, double serviceCharge, double tax) {
		double price= units * 8 + serviceCharge;
		return price+ (price*(tax)/100);
	}

	


}