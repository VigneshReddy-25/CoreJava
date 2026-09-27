package RandomClass;

import java.util.*;

public class RandomNumberGenerator {
	
	public static void main(String ars[]) {
		Random random=new Random();
		int random1=0;
		for(int i=0;i<3;i++) {
		random1=(random1*100)+random.nextInt(100);
		}
		System.out.println(random1);
	}
}
