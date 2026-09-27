package String;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "javaEEdeve"
;
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='E' || ch=='e') {
				count++;
			}
		}
		System.out.println(count);
	}

}
