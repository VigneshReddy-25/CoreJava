package Interface;

public class VehicleMain {

	public static void main(String args[]) {
		Vehicle v1=new Car();
		Vehicle v2=new Bus();
		Vehicle v3 = new Bike();
		v1.start();
		v2.start();
		v3.start();
		v1.stop();
		v2.stop();
		v3.stop();
	}
}
