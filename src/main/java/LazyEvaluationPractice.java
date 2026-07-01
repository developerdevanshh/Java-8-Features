import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LazyEvaluationPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        System.out.println("Building Pipline....");

        Optional<Integer> result = numbers.stream()
                .filter(n->{
                    System.out.println("Filtering: " + n);
                    return n>2;
                })
                .map(n->{
                    System.out.println("Mapping: " + n);
                    return n*n;
                })
                .findFirst(); // short-circuits - stops after first match

        Optional<Integer> result = numbers.stream()
                .filter(n->{
                    System.out.println("Filtering: " + n);
                    return n>2;
                })
                .map(n->{
                    System.out.println("Mapping: " + n);
                    return n*n;
                })
                .findFirst(); // short-circuits - stops after first match

        System.out.println("Result: " + result.get());
    }
}
