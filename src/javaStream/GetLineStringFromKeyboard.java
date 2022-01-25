package javaStream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is); // inputstream을 reader 로 변환하고
        BufferedReader br = new BufferedReader(reader); // 다시 bufferedReader를 연결

        while (true) {
            System.out.print("입력하세요 : ");
            String lineStr = br.readLine(); // 라인 단위로 문자열을 읽음
            if(lineStr.equals("q") || lineStr.equals("quit")) break; // q 또는 quit 를 읽었을 때 while 반복문 종료
            System.out.print("입력된 내용 : " + lineStr);
            System.out.println();
        }
        br.close();
    }
}
