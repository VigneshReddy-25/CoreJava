package Interface;

public class Car implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car engine started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car stopped");
	}

}
