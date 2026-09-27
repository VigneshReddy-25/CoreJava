package String;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MommomMom".toLowerCase();
		System.out.println(checkPalindrome(str));

	}
	public static String checkPalindrome(String str) {
		int low=0;
		int high=str.length()-1;
		int cnt=0;
		while(low<high) {
			if(str.charAt(low)==str.charAt(high)) {
				cnt++;
			}
			low++;
			high--;
		}
		if(str.length()==(cnt*2+1)) {
			return "Palindrome";
		}
		return "Not Palindrome";
	}

}
