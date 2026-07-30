public class NumberSequence {
  public static void main(String args[]){
    int a=10;
    print(a,1);
  }
  public static void print(int a,int count){
    if(count>a){
      return;
    }

    System.out.println(count);
    print(a,count+1);
  }
}
