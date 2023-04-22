import java.util.HashMap;

public class Roman_Integer {
    public static  void main(String[] args){
        HashMap<Character,Integer>hp=new HashMap<>();
        hp.put('I',1);
        hp.put('V',5);
        hp.put('X',10);
        hp.put('L',50);
        hp.put('C',100);
        hp.put('D',500);
        hp.put('M',1000);
        int sum=0;
        String s="MCMXCIV";
        char[] c=s.toCharArray();
        for (int i=0;i<s.length()-1;i++) {
            if (hp.get(c[i]) < hp.get(c[i+1])) {
                sum = sum - hp.get(c[i]);

            } else {
                sum = sum + hp.get(c[i]);
            }
        }
        System.out.println(sum+hp.get(c[s.length()-1]));

    }
}
