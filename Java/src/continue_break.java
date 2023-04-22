public class continue_break {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            outer:for (int j = 1; j <= 10; j++) {
                if (j*i == 12) {
                    continue outer;
                }
                System.out.println(i+" "+j);
            }


        }
    }
}