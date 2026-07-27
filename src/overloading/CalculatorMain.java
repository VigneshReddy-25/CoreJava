package overloading;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s11=387;
		Calculator cal=new Calculator();
		System.out.println(cal.add(10,83));
		System.out.println(cal.add(23,45, 0));
		System.out.println(cal.add(10,s11));
	}
}
