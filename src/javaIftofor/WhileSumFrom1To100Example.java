package javaIftofor;

public class WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i<=100) {
            sum +=i;
            i++; //마지막에 100++로 101이 된 상태
        }

        System.out.println("1~" + (i-1) + "합:" + sum);
    }
}
