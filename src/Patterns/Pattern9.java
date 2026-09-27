package Patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=0;i<num;i++) {
			char ch='A';
			for(int j=0;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
