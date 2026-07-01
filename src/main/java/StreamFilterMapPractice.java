import java.util.*;
import java.util.stream.*;

public class StreamFilterMapPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul","Amit","Sara","Raj","Rohan");

        List<String> result = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
