import java.util.HashMap;
import java.util.Locale;

public class caesar_cypher {
    static int get_index(char symbol) {
        char c;
        int i = 1;
        HashMap<Character, Integer> hp = new HashMap<>();
        char alp[] = new char[26];
        for (c = 'a'; c <= 'z'; c++) {

            hp.put(c, i);
            i++;


        }
        int a = hp.get(symbol);
        return a;
    }

    static char get_symbol(int index) {
        char c;
        int i = 1;
        HashMap<Integer, Character> hp = new HashMap<>();
        char alp[] = new char[26];
        for (c = 'a'; c <= 'z'; c++) {

            hp.put(i, c);
            i++;

        }
        char a = hp.get(index);
        return a;
    }

    static String Cypher(String s, int offset) {
        String k = "";
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (Character.isWhitespace(a[i])) {
                continue;
            }
            a[i] = get_symbol((get_index(a[i]) + offset) % 26);
            k = String.valueOf(a);
        }
        return k;
    }

    public static void main(String[] args) {

        String s = "abc mom";
        s=s.toLowerCase();
        String m=Cypher(s, 1);
        System.out.println(m);
    }
}
