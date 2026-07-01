import java.util.*;
public class OptionalPractice {
    public static Optional<String> findByUserId(int id){
        if(id == 1){
            return Optional.of("Rahul");
        } else if(id == 2){
            return Optional.of("Nikhil");
        } else if(id == 3){
            return Optional.of("Avinash");
        }

        return Optional.empty(); // Invalid ID

    }
    public static void main(String[] args) {

        int id = 2;
        String user = findByUserId(id).orElseThrow(() -> new RuntimeException("User not found wiht Id" + id));
        System.out.println(user);

//        Optional<String> name = Optional.of("Rahul");
//        Optional<String> empty = Optional.empty();
//
//        System.out.println(name.orElse("Default name"));
//        System.out.println(empty.orElse("Default name"));
//
//        name.ifPresent(n -> System.out.println("Found: " + n));
//
//        Optional<Integer> length = name.map(String::length);
//        System.out.println("Length: " + length.get());
//
//        String result = empty.orElseGet(()->"Generated Default");
//        System.out.println(result);
    }
}
