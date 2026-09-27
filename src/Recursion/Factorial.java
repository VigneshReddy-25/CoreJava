package Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));
	}
	
	public static int fact(int n) {
		if(n==1) return 1;
		return n*fact(n-1);
		
	}
}
//public class Factorial {
//    public static void main(String args[]){
//    int a=5;
//    System.out.println(fact(a));
//  }
//  public static int fact(int a){
//    if(a==1){
//      return 1;
//    }
//    return a*fact(a-1);
//  }
//}
