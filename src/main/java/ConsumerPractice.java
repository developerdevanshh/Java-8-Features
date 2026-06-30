import java.util.function.Consumer;
public class ConsumerPractice {
    public static void main(String[] args) {
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        Consumer<String> printUpper = name -> System.out.println("Upper: " + name.toUpperCase());

        Consumer<String> combined = printName.andThen(printUpper);
        combined.accept("devansh");
    }
}
