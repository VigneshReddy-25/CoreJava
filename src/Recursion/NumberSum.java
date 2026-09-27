package Recursion;

public class NumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=1234;
		System.out.println(sum(n));

	}
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		int temp=n%10;
		n/=10;
		return temp+sum(n); 
		
	}

}
