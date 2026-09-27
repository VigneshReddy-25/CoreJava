package Patterns;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<(2*n-1);i++) {
			for(int j=0;j<(2*n-1);j++) {
				int top=i;
				int left=j;
				int right=(2*n-j)-2;
				int down=(2*n-i)-2;
				int val=n-(Math.min(Math.min(right, left),Math.min(top, down)));
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

}
