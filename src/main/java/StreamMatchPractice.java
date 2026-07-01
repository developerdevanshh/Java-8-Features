import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMatchPractice {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10,15,20,33,42,51);
//
//        boolean allEven = numbers.stream().allMatch(n->n % 2 ==0);
//        boolean anyOdd = numbers.stream().anyMatch(n->n % 2 !=0);
//        Optional<Integer> firstOdd = numbers.stream().filter(n->n % 2 !=0).findFirst();
//
//        System.out.println("All even: " + allEven);
//        System.out.println("Any odd: " + anyOdd);
//        System.out.println("First odd: " + firstOdd.orElse(-1));

        List<String> names = Arrays.asList("Rahul","Amit","Sara","Raj","Priya","Sam");
        Boolean matchString = names.stream().allMatch(n->n.equals("Dev"));
        System.out.println(matchString);
    }
}
