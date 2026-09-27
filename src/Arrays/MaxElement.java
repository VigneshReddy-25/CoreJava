package Arrays;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={83,73,73,84,54};
	      int max=ar[0];
	      for(int num:ar){
	         if(max<num) max=num;
	      }
	      System.out.print(max);

	}

}
