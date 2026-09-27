package String;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am a java developer"
;
		System.out.println(count(str));
		
	}
	
	public static int  count(String str) {
		int n=1;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				n++;
			}
		}
		return n;
	}

}
