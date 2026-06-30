import java.util.function.Consumer;
public class ConsumerPractice {
    public static void main(String[] args) {
//        Consumer<String> printName = name -> System.out.println("Name: " + name);
//        Consumer<String> printUpper = name -> System.out.println("Upper: " + name.toUpperCase());
//
//        Consumer<String> combined = printName.andThen(printUpper);
//        combined.accept("devansh");

//        Consumer<int[]> checkEvenOdd = arr -> {
//            for(int num : arr){
//                if(num % 2 == 0){
//                    System.out.println(num + "is Even");
//                }else {
//                    System.out.println(num + "is Odd");
//                }
//            }
//        };

//        int[] numbers = {10,15,20,33,42,51};

//        checkEvenOdd.accept(numbers);

        Consumer<int[]> printArray = arr -> {
            System.out.println("Checking Numbers....");
        };

        Consumer<int[]> checkEvenOdd = arr -> {
            for(int num : arr){
                System.out.println(num + (num % 2 == 0 ? " is Even": " is odd"));
            }
        };

        Consumer<int[]> combined = printArray.andThen(checkEvenOdd);

        combined.accept(new int[]{10,22,334,23,43});
    }
}
