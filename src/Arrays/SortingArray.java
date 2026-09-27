package Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {36,73,41,413,2,4,46};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
