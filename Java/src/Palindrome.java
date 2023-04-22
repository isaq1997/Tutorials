import java.util.LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        int x = 123321;
        int k = 0;
        String a = Integer.toString(x);
        for (int i = 0; i < a.length() / 2; i++) {
            if (!a.substring(i, i + 1).equals(a.substring(a.length() - i - 1, a.length() - i))) {
                k++;

            }
        }
        if (k != 0) {
            System.out.println("no");
        } else {
            System.out.println("Yes");
        }
    }
}
