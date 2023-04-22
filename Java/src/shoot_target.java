import java.util.Random;
import java.util.Scanner;

public class shoot_target {
    public static void main(String[] args) {
        char[][] matrix = {
                {'0', '1', '2', '3', '4', '5'},
                {'1', '-', '-', '-', '-', '-'},
                {'2', '-', '-', '-', '-', '-'},
                {'3', '-', '-', '-', '-', '-'},
                {'4', '-', '-', '-', '-', '-'},
                {'5', '-', '-', '-', '-', '-'}};

        Random random = new Random();
        int min_val = 1;
        int max_val = 5;
        int a = random.nextInt(max_val)+min_val;
        int b = random.nextInt(max_val)+min_val;
        System.out.println(a);
        System.out.println(b);
        String status="";

        Scanner sc = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
        outer:while (sc.hasNext()) {
            String m = sc.next();
            String n = sc.next();
            try {
                int x = Integer.parseInt((m));
                int y = Integer.parseInt((n));


                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        if (a == x && b == y) {
                            {
                                matrix[x][y] = 'x';
                                System.out.print(matrix[i][j] + " | ");
                                status = "Won";
                                if (i == 5 && j == 5) {
                                    System.out.println();
                                    System.out.print("You have won!");
                                    break outer;
                                }
                            }

                        } else {
                            matrix[x][y] = '*';
                            System.out.print(matrix[i][j] + " | ");
                        }
                    }
                    System.out.println();

                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Enter again: ");
            }
        }

    }
}