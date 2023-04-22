import java.util.ArrayList;


public class primes {
    static ArrayList<Integer> prime_divisors(int a) {
        ArrayList<Integer> hp = new ArrayList<>();
        outer:
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        continue outer;

                    }

                }
                hp.add(i);


            }
        }
        return hp;
    }

    public static  void main(String[] args){
        int a=326;
        System.out.println(prime_divisors(a));

    }

}
