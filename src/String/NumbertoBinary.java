package String;

public class NumbertoBinary {

	public static void main(String[] args) {
		int n=13;
		// TODO Auto-generated method stub
		String binary="";
		while(n!=0) {
			int remp=n%2;
			n=n/2;
			binary=remp+binary;
		}
		
		System.out.println(binary);
		

	}
}
