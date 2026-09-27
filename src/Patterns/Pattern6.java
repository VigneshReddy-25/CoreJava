package Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		for(int j=0;j<n;j++) {
			for(int k=0;k<j;k++) {
				System.out.print(i+" ");
				i++;
				
			}
			System.out.println();
			
		}
	}

}
