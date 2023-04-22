import java.math.BigInteger;

public class sum_of_integers {
    public static  int getSum(int a, int b) {
        int result = (int)(Math.log(Math.pow(2,a)*Math.pow(2,b)) / Math.log(2));
        return result;

    }
    public static void main (String[] args){


        System.out.println(getSum(-999,0));

    }
}
