package Map;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

	public static void main(String args[]) {
		String str="vignesh";
		
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			Character key=entry.getKey();
			Integer val=entry.getValue();
			System.out.println("Key: "+key+", Value: "+val);
		}
		
	}
}
