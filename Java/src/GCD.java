import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class GCD {
    static ArrayList<Integer>intersect(ArrayList<Integer>a,ArrayList<Integer>b){
        ArrayList<Integer>intersect=new ArrayList<Integer>();
      for (int i=0;i<a.size();i++){
          for (int j=0;j<b.size();j++){
               if(a.get(i)==b.get(j)){
                   intersect.add(a.get(i));
               }
          }
      }
    return intersect;
    }
    public  static  void main(String[] args){
        int a=333;
        int b=45;

        ArrayList<Integer>divisors=new ArrayList<Integer>();
        ArrayList<Integer>m=new ArrayList<Integer>();
        ArrayList<Integer>n=new ArrayList<Integer>();
        for (int i=1;i<=a;i++){
            if(a%i==0) {
                m.add(i);
            }
        }
        System.out.println("");
        for (int j=1;j<=b;j++){

            if(b%j==0) {
                n.add(j);
            }
        }
        divisors=intersect(m,n);
        Collections.sort(divisors, Collections.reverseOrder());
        System.out.println(divisors.get(0));
    }
}
