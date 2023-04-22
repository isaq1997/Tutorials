import java.util.ArrayList;
import java.util.Collections;

public class Unique_nums {
    public static int count_nums(int n) {
        int i = 0;
        while (n != 0) {
            n = n / 10;
            i++;
        }
        return i;
    }
    public static ArrayList<Integer> split_into_nums(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < count_nums(n); i++) {
            nums.add(n % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i));
        }
      //  Collections.reverse(nums);
        return nums;
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 0;
        int a=0;
        ArrayList<Integer> nums = split_into_nums(n);
        for (int s = 10; s < Math.pow(10, n); s++) {
            k=0;
            for (int i = 0; i < count_nums(s); i++) {
                for (int j = i + 1; j < count_nums(s); j++) {
                    if (k == 0) {
                        if (split_into_nums(s).get(i) == split_into_nums(s).get(j)) {
                            k++;
                            a++;
                            //System.out.println(a);
                        }
                    }
                }
            }
        }
        System.out.println((int)Math.pow(10, n)-a);
    }
}

//4725