package javaVariable;

import java.util.Scanner;

public class ScannerExample2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[필수 정보 입력]");
        System.out.print("1. 이름 : ");
        String name = scanner.nextLine();

        System.out.print("2. 주민번호 앞 6자리 : ");
        String number = scanner.nextLine();

        System.out.print("3. 전화번호 : ");
        String phoneNumber = scanner.nextLine();

        System.out.println("[입력한 내용]");
        System.out.println(name);
        System.out.println(number);
        System.out.println(phoneNumber);


    }
}
