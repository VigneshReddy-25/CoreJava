package Patterns;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int count=0;
		char ch='E';
		for(int i=0;i<num;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
				count++;
				
			}
			ch=(char)(ch-count-1);
			count=0;
			System.out.println();
		}
	}

}
