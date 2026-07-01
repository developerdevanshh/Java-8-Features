import java.util.*;
public class StreamReducePractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream().reduce(0,Integer::sum);
        int product = numbers.stream().reduce(1,(a,b) -> a*b);
        Optional<Integer> max = numbers.stream().reduce((a,b) -> a>b ? a:b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max: " + max);
    }
}
