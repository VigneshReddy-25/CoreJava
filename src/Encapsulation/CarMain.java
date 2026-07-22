package Encapsulation;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.setModel("MINI COOPER");
		car.setYear(2026);
		System.out.println("Car Model  :  "+ car.getModel());
		System.out.println("Year  :  "+car.getYear());
	}

}
