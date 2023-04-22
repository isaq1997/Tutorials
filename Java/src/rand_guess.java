import java.util.*;

public class rand_guess {
    public  static void main(String[] args){

        Random random = new Random();
        int a = random.nextInt(100);
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>integers=new ArrayList<>();

        System.out.println("Let the game begin!!!");
        while(sc.hasNext()) {
            String x = sc.next();
            try {
               int b = Integer.parseInt(x);
                if (b > a) {
                    System.out.println("Your number is big: ");
                    integers.add(b);
                } else if (b < a) {
                    System.out.println("Your number is small: ");
                    integers.add(b);
                } else {
                    System.out.println("Congrulations!");
                    integers.add(b);
                    Collections.sort(integers, Collections.reverseOrder());
                    System.out.print(integers);
                    break;
                }

            }
            catch (NumberFormatException e)
            {
                System.out.println("Enter again ");
            }
        }



    }
}
