import java.util.ArrayList;
import java.util.Iterator;

public class Array_and_Linked {
    public  static void main (String[] args){
        ArrayList<String> namesArr=new ArrayList<>();
        namesArr.add("Moo");
        namesArr.add("Cer");
        System.out.println(namesArr.get(0));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // Get the iterator
        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()) {
            Integer i=it.next();
            if(i<=2){
                it.remove();

            }

            System.out.println(it.next());
        }
    }
}
