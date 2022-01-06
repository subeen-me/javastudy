package javaClass;

public class Calculator1Example {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator1.pi;

        int result2 = Calculator1.plus(10, 5);
        int result3 = Calculator1.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
