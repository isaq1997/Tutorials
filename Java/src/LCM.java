import java.util.ArrayList;

public class LCM {


    static  int lcm(int x, int y) {
        int gcd = 1;

        for (int i = 1; i <= x && i <= y; i++) {

            if (x % i == 0 && y % i == 0) {
                gcd = i;

            }

        }
        return x*y/gcd;
    }

    public static  void main(String[] args){
      int a=24;
      int b=32;
      int x=lcm(a,b);
        System.out.println(x);




    }
}
