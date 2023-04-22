import java.util.Scanner;
import java.util.regex.Pattern;

public class week_planner {
    public static void main(String[] args) {
        String schedule[][] = {{"Sunday", "do home work"},
                {"Monday", "go to courses; watch a film"},
                {"Tuesday", "Code!"},
                {"Wednesday", "running and jogging"},
                {"Thursday", "appoint the meeting"},
                {"Friday", "test project"},
                {"Saturday", "have a lunch in city"}};

        Scanner sc = new Scanner(System.in);
        String k = "";
        String a="";
        outer:while (sc.hasNext()) {
            String b = sc.next();
          if(!b.equals("exit")) {
              b.replaceAll("\s+", "");
               a = b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase();
          }
          else
               a=b;



            for (int i = 0; i < schedule.length; i++) {

                if (a.equals("exit")) {

                    break outer;

                }

                else if (Pattern.matches("[a-zA-Z]+", a)) {
                    if (schedule[i][0].equals(a)) {
                        k = schedule[i][1];
                        System.out.println(k);
                    }
                } else {
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
                }
            }
        }
    }
}
