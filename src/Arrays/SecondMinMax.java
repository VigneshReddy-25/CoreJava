package Arrays;

public class SecondMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {27,73,25,75,52,63};
		int maxi=ar[0];
		int SecondMax=ar[0];
		int min=ar[0];
		int Smin=ar[0];
		for(int num: ar) {
			if(num>maxi) {
				SecondMax=maxi;
				maxi=num;
				
			}else if(num>SecondMax&& num<maxi) {
				SecondMax=num;
			}
			if(num<min) {
				Smin=min;
				min=num;
			}
			else if(num<Smin && num>min) {
				Smin=num;
			}
			
			
		}
		System.out.println("Second max in array: "+SecondMax);
		System.out.println("Maximum in array: "+maxi);
		System.out.println("Second Minimum in array: "+Smin);
		System.out.println("Minimum in array: "+min);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
