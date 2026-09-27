package Patterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=1;
		int space=n-star;
		for(int i=0;i<n;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}
