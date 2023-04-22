import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Patterns {

    public static  void main (String[] args){
        String s ="Change MONDAY" ;
        String cap = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        if (Pattern.matches("[a-zA-Z]+", s)) {
            System.out.println("clear");
        } else {
            System.out.println("buzz");
        }

        System.out.println(cap);
        System.out.println(s.substring(0,6));
        System.out.println(s.substring(7));
        System.out.println("Exit".toLowerCase());

    }
}
