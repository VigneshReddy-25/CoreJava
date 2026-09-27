package Patterns;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int num=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) num=0;
			else num=1;
			for(int j=0;j<=i;j++) {
					if(num==0) {
						num++;
					}
					else num--;
				
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

}
