package javaStream;

import java.io.FileWriter;
import java.io.Writer;

public class WriterWriteExample4 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/kimsubeen/IdeaProjects/javastudy/src/javaStream/test10.txt");

        String str = "ABC";

        writer.write(str); // 문자열 전체를 출력

        writer.flush(); // 출력 버퍼에 잔류하는 모든 문자열을 출력
        writer.close(); // 출력 스트림을 닫음
    }
}
