import java.util.ArrayList;
import java.util.List;

public class Generics <T>{
    T entity;
    public Generics(T entity){
        this.entity=entity;

    }

    public  void print(){

        System.out.println(entity);
    }

}

class Main{
    public static void main (String[] args){
        Generics<Integer>gn=new Generics<>(3);
        Generics<String>g=new Generics<>("jj");
        gn.print();
        g.print();
        make(32);
        make("ds");

        List<Integer>aa=new ArrayList<>();
        aa.add(4);
        aa.add(3);
        List<String>aa1=new ArrayList<>();
        aa1.add("df");
        aa1.add("fg");
        printlist(aa);
        printlist(aa1);

    }

private static <T>void make(T value){//Generic Method
    System.out.println(value);

}
private static <T>void printlist(List<?>list){//Generic Method
    System.out.println(list);

    }
}