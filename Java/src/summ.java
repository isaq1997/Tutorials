import java.util.ArrayList;


public class summ {
     static  int  total(ArrayList<Integer>summ){
        int total=0;

               for (Integer integer : summ ) {
                total+=integer;


               }

    return  total;
    }
    public  static void main(String[] args){
        ArrayList<Integer>summ=new ArrayList<Integer>();
        summ.add(4);
        summ.add(33);
        summ.add(13);
        summ.add(33);
        summ.add(-6);
        int a= total(summ);
        System.out.println(a);


    }
}
