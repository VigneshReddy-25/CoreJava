package Patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int space=3;
		for(int i=0;i<num;i++) {
			char ch='A';
			for(int j=0;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(ch+" ");
			}
			space--;
			System.out.println();
		}
	}

}
