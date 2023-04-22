public class leetCode2 {
    public static void main(String[] args){
        int n=14;
        int k=0;
        while(n>0){
           if(n%2==0){
               n=n/2;
           }
           else
               n=n-1;

           k++;

        }
        System.out.println(k);

    }
}
