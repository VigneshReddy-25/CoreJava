package String;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="javadev";
		
		
		System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			str1+=ch;
		}
		return str1;
		
	}
	

}
