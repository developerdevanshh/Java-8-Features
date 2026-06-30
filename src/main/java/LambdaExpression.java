interface MathOperation {
    int operate(int a,int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> a + b;
        MathOperation subtract = (a,b) -> a - b;
        MathOperation multiply = (a,b) -> a * b;
        MathOperation division = (a,b) -> a / b;

        System.out.println("Add: " + add.operate(10,5));
        System.out.println("Subtract: " + subtract.operate(10,2));
        System.out.println("Multiply: " + multiply.operate(15,8));
        System.out.println("Divide: " + division.operate(20,4));
        try{
            System.out.println("Divide: " + division.operate(20,0));
        }catch (ArithmeticException e){
            return;
        }
    }
}