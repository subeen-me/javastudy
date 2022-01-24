package javaStream;

import java.io.FileWriter;
import java.io.Writer;

public class WriterWriteExample {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("/Users/kimsubeen/IdeaProjects/javastudy/src/javaStream/test7.txt");

        char a = 'A';
        char b = 'B';
        char c = 'C';

        // 한 문자씩 출력
        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
        writer.close(); // 출력 스트림을 닫음
    }
}
