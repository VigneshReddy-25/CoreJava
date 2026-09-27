package Arrays;

public class MinMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {83,37,39,25,94};
		int max=ar[0];
		int min=ar[0];
		for(int num:ar) {
			if(min>num) min=num;
			else if(max<num)  max=num;
		}
		System.out.println(max);
		System.out.println(min);
	}

}
