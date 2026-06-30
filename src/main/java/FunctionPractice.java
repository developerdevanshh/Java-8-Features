import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String,Integer> strLength = String::length;
        Function<Integer,Integer> square = n -> n*n;

        // Chaining - first strLength then square
        Function<String,Integer> lengthSquared = strLength.andThen(square);
//        Function<Integer, String> intToString =  lengthSquared.andThen(result -> "Result: " + result);
//        Function<Integer, String> formatResult =
//                lengthSquared.andThen(result -> "Result: " + result);
        Function<String, String> formatResult =
                lengthSquared.andThen(result -> "Result: " + result);

        System.out.println(strLength.apply("Hello"));
        System.out.println(lengthSquared.apply("Hello"));
        System.out.println(formatResult.apply("Hello"));
    }
}
