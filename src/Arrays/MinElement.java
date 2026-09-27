package Arrays;

public class MinElement {
	public static void main(String args[]) {
		int ar[]={83,73,73,84,54};
	      int min=ar[0];
	      for(int num:ar){
	         if(min>num) min=num;
	      }
	      System.out.print(min);
	}
}
