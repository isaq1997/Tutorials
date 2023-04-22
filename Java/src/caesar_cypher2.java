public class caesar_cypher2 {
    static String Cypher(String s, int offset) {
        char[] a = s.toCharArray();
        String cypher = "";

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == ' ')
            {
                cypher += a[i];
                continue;
            }
            else if(Character.isUpperCase(a[i]))
            {
                int x=(((int) a[i]) + offset-65)%26+65;
                cypher += (char) (x);
            }
            else
            {
                int x=(((int) a[i]) + offset-97)%26+97;
                cypher += (char) (x);
            }
        }
        return cypher;
    }

    public static void main(String[] args) {
       String v="Attack  Be done at night";
       String m=Cypher(v,21);
       System.out.println(m);

    }
}