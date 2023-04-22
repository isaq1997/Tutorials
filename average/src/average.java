import java.util.ArrayList;

public class average {

    public static ArrayList<Double> fill_list(double[] x) {
        ArrayList<Double> a = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            a.add(x[i]);
        }
        return a;
    }

    public static double average(ArrayList<Double> m) {
        double sum = 0;
        for (int i = 0; i < m.size(); i++) {
            sum = sum + m.get(i);

        }
        double average = sum / m.size();
        return average;
    }


    public static void main(String[] args) {
        double x[] = {2, 2,2,2,10};
        double m = average(fill_list(x));
        System.out.println(m);
    }
}
