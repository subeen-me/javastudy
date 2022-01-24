package javaStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("/Users/kimsubeen/IdeaProjects/javastudy/src/javaStream/test2.db");

        // 길이가 100인 배열 생성
        byte[] buffer = new byte[100];

        while (true) {
            int readByteNum = is.read(buffer); // 배열 길이만큼 읽기
            if(readByteNum == -1) break; // 파일 끝에 도달했을 경우
            // 읽은 바이트 수 만큼 반복하면서 배열에 저장된 바이트를 출력
            for(int i=0; i<readByteNum; i++) {
                System.out.println(buffer[i]);
            }
        }

        // 입력 스트림을 닫음
        is.close();
    }
}
