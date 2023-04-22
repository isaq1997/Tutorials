public class leetCode {
    public static void main(String[] args){
           int a=6969;
           String s= Integer.toString(a);
           char[] m=s.toCharArray();
           for (int i=0;i<s.length();i++) {
               if(m[i]=='9')
                   continue;
               else
                   m[i]='9';
                   break;
           }

               System.out.println(m);

    }
}
