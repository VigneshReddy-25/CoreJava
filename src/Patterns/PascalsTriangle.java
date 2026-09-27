package Patterns;

public class PascalsTriangle {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int n=5;
		int num=1;
		int space=n-num;
		for(int i=0;i<n;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			int num1=1;
			for(int k=0;k<=i;k++) {
				System.out.print(num1+" ");
				num1=num1*(i-k)/(k+1);
				
			}
			System.out.println();
			num1++;
			space--;
		}

	}

}
