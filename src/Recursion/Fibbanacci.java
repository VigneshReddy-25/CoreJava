package Recursion;

public class Fibbanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		int a=0;
//		int b=1;
//		System.out.print(a+" "+b+" ");
//		for(int i=2;i<n;i++) {
//			int c=a+b;
//			a=b;
//			b=c;
//			System.out.print(c+" ");
//		}
		
		for(int i=0;i<n;i++) {
		System.out.print(fib(i)+" ");
		}
		
		
		
	}
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
	
		return fib(n-1)+fib(n-2);
		
		
	}

}
