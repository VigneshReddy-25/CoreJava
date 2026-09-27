package String;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="I am java developer";
		String str[]=s1.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}

}
