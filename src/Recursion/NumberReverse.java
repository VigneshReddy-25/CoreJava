public class NumberReverse {
    public static void main(String args[]){
        int a=10;
        printrev(a);
    }
    public static void printrev(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        printrev(a-1);
    }
}
