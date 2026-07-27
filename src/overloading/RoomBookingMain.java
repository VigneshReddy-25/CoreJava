package overloading;

public class RoomBookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomBooking b1 = new RoomBooking("Rahul");
        b1.displayBooking();
        System.out.println();

        // Object using constructor 2
        RoomBooking b2 = new RoomBooking("Sneha", "Deluxe");
        b2.displayBooking();
        System.out.println();

        // Object using constructor 3
        RoomBooking b3 = new RoomBooking("Vignesh", "Suite", 5);
        b3.displayBooking();

        System.out.println("Default Bill        : ₹" + b3.calculateBill());
        System.out.println("Custom Rate Bill    : ₹" + b3.calculateBill(3000));
        System.out.println("Discounted Bill     : ₹" + b3.calculateBill(3000, 10));

	}

}
