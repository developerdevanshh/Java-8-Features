import java.util.Random;
import java.util.function.Supplier;
public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<Double> randomNum = () -> Math.random() * 100;

        Random random = new Random();
        Supplier<Integer> OTP = () -> random.nextInt(900000);

        Supplier<String> greeting = () -> "Hello, world!";

        System.out.println(randomNum.get());
        System.out.println(greeting.get());

        System.out.println("OTP: " + OTP.get());
        System.out.println("OTP: " + OTP.get());
        System.out.println("OTP: " + OTP.get());

    }
}
