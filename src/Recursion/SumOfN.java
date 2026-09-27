public class SumOfN {
    public static void main(String args[]){
        int a=5;
        int sum=0;
        System.out.println("Sum of first "+a+" natural numbers is: "+sum(a,sum));
    }
    public static int sum(int a,int sum){
        if(a==0){
            return sum;
        }
        sum+=a;
        return sum(a-1,sum);

    }
}
