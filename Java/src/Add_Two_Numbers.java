import java.util.LinkedList;
import java.util.Scanner;

public class Add_Two_Numbers {
    public static int add_sum (LinkedList<Integer>list){
        double sum=0;
        int a=list.size();
        for (int i=0;i<a;i++) {

            sum = sum + list.get(i) *Math.pow(10, i) ;
        }
        return  (int)sum;

    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        LinkedList<Integer>list=new LinkedList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        LinkedList<Integer>list1=new LinkedList<>();
        list1.add(sc.nextInt());
        list1.add(sc.nextInt());
        list1.add(sc.nextInt());
        LinkedList<Integer> list2 = new LinkedList<>();
        int x=add_sum(list)+add_sum(list1);
        //System.out.println(x);
        int k=0;
        while(x>0){
         x=x/10;

         k++;

        }
        //System.out.println(k);
        x=add_sum(list)+add_sum(list1);
        for (int i=0;i<k;i++) {
            int y=x%10;
           list2.add(y);
            x=x/10;

        }
        System.out.println(list2);

    }
}
