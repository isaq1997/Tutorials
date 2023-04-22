import java.util.ArrayList;
import java.util.Collections;

public class uni {

    public static void main(String[] args) {
        int n = 2;
        int sum=0;
        int product = 1;
        if (n == 0) {
            System.out.println(1);

        } else if (n == 1) {
            System.out.println(10);
        } else {
            for (int k=0;k<=n-2;k++) {
                product=1;
                for (int i = 1; i <= k; i++) {
                    product = product * (9 - i);

                }
                sum+=product;
            }
            System.out.println(81*sum+10);
            //System.out.println(81 * product);
        }
        //System.out.println(81 * sum);
    }
}
