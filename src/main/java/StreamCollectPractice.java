import java.util.*;
import java.util.stream.*;


public class StreamCollectPractice {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Rahul","Amit","Sara","Raj","Priya","Sam");
//
//        Map<Integer,List<String>> groupedByLength = names.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//        System.out.println(groupedByLength);
//
//        String joined = names.stream()
//                .collect(Collectors.joining(",","[","]"));
//
//        System.out.println(joined);

        List<Integer> numbers = Arrays.asList(10,15,20,33,42,51);

        Map<Boolean,List<Integer>> groupedByType = numbers.stream()
                .collect(Collectors.groupingBy(n->n % 2 == 0));

        System.out.println(groupedByType);
    }
}
