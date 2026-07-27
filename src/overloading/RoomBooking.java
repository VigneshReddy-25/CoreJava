package overloading;

public class RoomBooking {

	String name;
	String roomType;
	int noOfDays;
	
	public RoomBooking(String name){
		this.name=name;
	}
	public RoomBooking(String name,String roomType) {
		this.name=name;
		this.roomType=roomType;
	}
	public RoomBooking(String name, String roomType,int noOfDays) {
		this.name=name;
		this.roomType=roomType;
		this.noOfDays=noOfDays;
	}
	
    public double calculateBill() {
        return noOfDays * 2000;
    }

    public double calculateBill(double roomRate) {
        return noOfDays * roomRate;
    }

    public double calculateBill(double roomRate, double discount) {
        double bill = noOfDays * roomRate;
        double discountAmount = bill * discount / 100;
        return bill - discountAmount;
    }

    public void displayBooking() {
        System.out.println("Customer Name : " + name);
        System.out.println("Room Type     : " + roomType);
        System.out.println("Days          : " + noOfDays);
    }

	
	
}
