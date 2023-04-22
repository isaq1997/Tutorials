import java.util.regex.Pattern;

public class simple_proj {
    int id;
    String name;

       simple_proj(int id,String name){
       this.id=id;
       this.name=name;

    }
    public static void main(String[] args){
         simple_proj si=new simple_proj(1,"uuu");
         simple_proj rr=new simple_proj(3,"re");
         System.out.println(si.id);
         System.out.println(rr.name);
         String s="  ff                                         gg ";
         s=s.trim();
         s=s.replaceAll("\\s+"," ");
         String[] arr=s.split(" ");
         System.out.println(arr[arr.length-1].length());

         System.out.println(Pattern.matches("g", s));
    }
}
