package javaVariable;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception{
        //스캐너 불러온다
        Scanner scanner = new Scanner(System.in);
        //String 타입의 inputData 변수를 선언한다
        String inputData;

        //while문 작성
        while(true) {
            //inputData에 스캐너로 읽은 값 저장
            inputData = scanner.nextLine();
            //입력된 문자열 " " 이 되도록 출력하는 코드 작성
            System.out.println("입력된 문자열 : \"" + inputData + "\"");
            //q를 입력하면 중지되는 if문 만들기
            if(inputData.equals("q")){
                break;
            }
        }

        System.out.println("종료");
    }
}
