package javaStream;

import java.io.FileReader;
import java.io.Reader;

public class ReaderReadExample3 {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("/Users/kimsubeen/IdeaProjects/javastudy/src/javaStream/test9.txt");

        char[] buffer = new char[5];

        // 입력 스트림으로부터 3개의 문자를 읽고 buffer[2], [3], [4]에 각각 저장
        int readCharNum = reader.read(buffer, 2, 3 );
        if(readCharNum != -1) { // 읽은 문자가 있다면
            // 배열 전체를 읽고 출력
            for(int i=0; i<buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }

        // 입력 스트림을 닫음
        reader.close();
    }
}
