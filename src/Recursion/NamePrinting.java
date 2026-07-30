public class NamePrinting {
    public static void main(String args[]){
        String name="Vignesh";
        int n=3;
        print(name,n);
    }
    public static void print(String name,int n){

        if(n==0){
            return;
        }
        System.out.println(name);
        print(name,n-1);
    }
}
