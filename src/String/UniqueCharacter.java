package String;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="javajavajavadevdevdev";
		System.out.println(unique(str));
	}
	public static String unique(String str) {
		String str1="";
		int count =0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count==0) str1+=str.charAt(i);
			count=0;
		}
		return str1;
	}

}
