package javaStream;

import java.io.FileWriter;
import java.io.Writer;

public class WriterWriteExample3 {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("/Users/kimsubeen/IdeaProjects/javastudy/src/javaStream/test9.txt");

        char[] array = {'A', 'B', 'C', 'D', 'E'};

        writer.write(array, 1, 3); // 배열의 1번 인덱스부터 3개를 출력

        writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
        writer.close(); // 출력 스트림을 닫음
    }
}
