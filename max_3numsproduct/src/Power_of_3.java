import java.util.ArrayList;

public class Power_of_3 {
    public static boolean get_data(int x) {
        ArrayList<Integer> residuals = new ArrayList<>();

        int a = 0;
        int i = -1;
        boolean bo = false;

        while (x > 0) {
            a = (int) (Math.log10(x) / Math.log10(3));
            x = (int) (x - Math.pow(3, a));
            i++;
            System.out.println(x + " " + a);
            residuals.add(a);

            if (i > 0||(x==0 && i==0)) {
                if (i>0) {
                    if (residuals.get(i) == residuals.get(i - 1)) {
                        bo = false;
                        break;
                    }
                }
                bo = true;
            }
        }
        return bo;
    }

    public static void main(String[] args) {
        System.out.println(get_data(27));

    }


}
