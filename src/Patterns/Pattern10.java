package Patterns;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int n=num;
		for(int i=0;i<num;i++) {
			char ch='A';
			for(int j=0;j<n;j++) {
				System.out.print(ch);
				ch++;
			}
			n--;
			System.out.println();
		}
	}

}
