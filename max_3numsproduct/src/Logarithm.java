public class Logarithm {
    public static boolean isPowerOfFour(int n) {
        double x = Math.log(n)/ Math.log(2);
        if (x==(int)x){
            return true;
        }
        else
            return false;
    }
    public static void main (String[] args){
        int n=536870912;
        System.out.println(isPowerOfFour(n));
        double x = Math.log10(536870912)/ Math.log10(2);
        System.out.println(x);

    }
}
