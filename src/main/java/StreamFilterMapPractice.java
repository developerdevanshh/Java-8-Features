import java.util.*;
import java.util.stream.*;

public class StreamFilterMapPractice {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Rahul","Amit","Sara","Raj","Rohan");
//
//        List<String> result = names.stream()
//                .filter(name -> name.length() > 4)
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(result);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> result = numbers.stream()
                .filter(n -> n%2 ==0)
                .map(n->n*n)
                .collect(Collectors.toList());
    }
}
