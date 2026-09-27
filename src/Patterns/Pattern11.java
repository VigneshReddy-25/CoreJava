package Patterns;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		char ch='A';
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch);
			}
			
			System.out.println();
			ch++;
		}
	}

}
