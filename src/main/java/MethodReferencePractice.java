import java.util.*;
import java.util.function.*;

public class MethodReferencePractice {
    public static void main(String[] args) {

        // Static method reference
        Function<String,Integer> parse = Integer::parseInt;
        System.out.println(parse.apply("123"));

        // Instance method reference(arbitary object)
        Function<String,String> upper = String::toUpperCase;
        System.out.println(upper.apply("devv"));

        // Instance method reference(specific object)
        String greeting = "Hello, ";
        Function<String,String> greet = greeting::concat;
        System.out.println(greet.apply("Dev"));

        // Constructor reference
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();
        list.add("A1");
        System.out.println(list);

        // In Streams
        List<String> names = Arrays.asList("rahul","amit","sara");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        names.stream().sorted(String::compareTo).forEach(System.out::println);
    }

}
