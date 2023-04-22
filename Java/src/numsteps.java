public class numsteps {
    public static int numSteps(String s) {
        int a=s.length();
        double sum=0;
        int k=0;
        char []c=s.toCharArray();

        for(int i=0;i<a;i++){
            int y=Integer.parseInt(String.valueOf(c[i]));
            sum=sum+(Math.pow(2,a-1-i)*y);

        }

        while(sum!=1){
            if(sum%2==1){
                sum=sum+1;k++;
            }
            else {
                sum = sum / 2;k++;
            }

        }

        return k;

    }

    public static  void main(String[] args){
String s="1111011110000011100000110001011011110010111001010111110001";

        System.out.println(numSteps(s));


    }
}
