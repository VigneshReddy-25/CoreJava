package Map;

import java.util.HashMap;
import java.util.Map;
public class containsMap {

	public static void main(String args[]) {
		String str[]= {"This", "is", "Hash","Map"};
		HashMap<String, Integer> hmap=new HashMap<>();
		for(String str1:str) {
			hmap.put(str1, hmap.getOrDefault(hmap, 0)+1);
		}
//		for(Map.Entry<String,Integer> entry:hmap.entrySet()) {
			if( hmap.containsKey("this")) {
				System.out.println(true);
				return;
			}
//		}
			System.out.print(false);
	}
}
