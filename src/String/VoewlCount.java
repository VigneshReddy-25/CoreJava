package String;

public class VoewlCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="javajava";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
