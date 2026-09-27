package Map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String arg[]) {
		String st="Hello world hello Java world".toLowerCase();
		String str[]=st.split(" ");
		Map<String, Integer> hmap=new HashMap<>();
		for(String str1:str) {
			hmap.put(str1, hmap.getOrDefault(str1,0)+1);
		}
		for(Map.Entry<String,Integer> entry:hmap.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}
