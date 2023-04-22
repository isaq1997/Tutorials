public class Minimum_Moves {
    public static void main(String []args){
        int x=19;

        int max_doubles=2;
        int i=0;
        while(x>1) {

            if (x % 2 == 0 && max_doubles > 0) {
                x = x / 2;
                max_doubles--;
                i++;
            } else if (x % 2 == 1 && max_doubles > 0) {
                x = x - 1;

                i++;
            } else if (max_doubles == 0) {
                x = x - 1;
                i += x;
                break;

            }
        }
        System.out.println(i);
    }
}
