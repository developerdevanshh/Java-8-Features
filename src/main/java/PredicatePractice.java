import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {
//        Predicate<Integer> isEven = n -> n % 2 == 0;
//        Predicate<Integer> isPositive = n -> n > 0;
//
//        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
//        Predicate<Integer> isOdd = isEven.negate();
//
//        System.out.println(isEven.test(8));
//        System.out.println(isEvenAndPositive.test(103));
//        System.out.println(isOdd.test(33));


        // A Predicate that checks if a String is a palindrome.
        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };

        System.out.println(isPalindrome.test("madam"));
        System.out.println(isPalindrome.test("level"));
        System.out.println(isPalindrome.test("java"));
        System.out.println(isPalindrome.test("racecar"));
    }
}
