package Patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int star=1;
		int space=n-star;
		 for(int  i=0;i<n;i++) {
			 for(int j=0;j<space;j++) {
				 System.out.print(" ");		 
			 }
			 for(int k=0;k<star;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
			 star+=2;
			 space--;
		 }

	}

}
