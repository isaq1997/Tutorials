import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class get_row {
    public List<Integer> getRow(int rowIndex) {


        return null;
    }
    public static void main(String[] args) {
        int row=3;
        ArrayList<Integer>add_el=new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer>add_el2=new ArrayList<>();

        System.out.println(add_el);
      for (int j=1;j<row;j++) {
          int a= add_el.size();
          for (int i = 0; i < a - 1; i++) {
              if(i==0){
                  add_el2.add(1);
              }
              add_el2.add(add_el.get(i) + add_el.get(i + 1));
              if(i==0){
                  add_el2.add(1);
              }
          }
          add_el=add_el2;
      }

        System.out.println(add_el);
        add_el2.add(0,1);
        add_el2.add(add_el2.size(),1);
        System.out.println(add_el2);


    }

}
