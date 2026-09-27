package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,63,63,34,73,36,36,73,25};
		for(int i=0;i<arr.length;i++) {
			boolean Notrepeating=true;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&& i!=j) {
					Notrepeating=false;
					break;
				}
			}
			if(Notrepeating) System.out.print(arr[i]+" ");
		}
		
	}

}
