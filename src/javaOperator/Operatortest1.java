package javaOperator;

import java.util.Scanner;

public class Operatortest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
        Double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("두 번째 수 : ");
        Double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("-----------------");

        if(num2 !=0.0) {
            System.out.println("결과 : " + (num1 / num2));
        } else {
            System.out.println("결과 : 무한대");
        }

    }
}
