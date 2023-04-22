// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class sum_binary {
    public static void main(String[] args) {
        String s="111101";
        int a=s.length();
        double sum=0;
        int k=0;
        char []c=s.toCharArray();

        for(int i=0;i<a;i++){
            int y=Integer.parseInt(String.valueOf(c[i]));
            sum=sum+(Math.pow(2,a-1-i)*y);

        }
        System.out.println(s.length());
        System.out.println((sum));
    }
}