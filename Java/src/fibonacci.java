public class fibonacci {

    static  int fibonacci(int n){
        int n0=0;
        int n1=1;
        int n2=1;
        for (int i=1;i<=n;i++)
        {
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }
        return  n0;

    }
    public static void main(String[] args){

      int x=fibonacci(25);
      System.out.println(x);
    }
}
