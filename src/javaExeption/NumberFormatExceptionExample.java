package javaExeption;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);

        //data2에는 숫자로 반환될 수 없는 문자가 포함되어있기 때문에 예외 발생
    }
}
