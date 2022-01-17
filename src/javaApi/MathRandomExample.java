package javaApi;

public class MathRandomExample {
    public static void main(String[] args) {
        int num = (int) (Math.random()*6) + 1;
        int num2 = (int) (Math.random()*45) + 1;
        System.out.println("주사쉬 눈 : " + num);
        System.out.println("로또 번호 : " + num2);
    }
}
