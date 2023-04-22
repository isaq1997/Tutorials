import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args){

        List<Integer>number= Arrays.asList(2,3,4,5);
        System.out.println(number);
        List<Integer>square=number.stream().map(x ->x*x*x).collect(Collectors.toList());
        System.out.println(square);
        Set<Integer> squareSet =number.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);


        List<String> names =
                Arrays.asList("Reflection","Collection","Stream","System");
        List<String> result=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);


        List<Integer>array=Arrays.asList(3,42,1,8,7,6);
        List<Integer>nums=array.stream().sorted().collect(Collectors.toList());
        System.out.println(nums);

        int sum=number.stream().reduce(1,(x,y)->x*y);
        System.out.println(sum);
        int even =
                number.stream().filter(x->x%2==0).reduce(0,(x,y)-> x+y);
        System.out.println(even);


    }
}
