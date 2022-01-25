package javaStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/kimsubeen/IdeaProjects/javastudy/src/javaStream/primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        // 기본 타입 값 출력
        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("김자바");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("/Users/kimsubeen/IdeaProjects/javastudy/src/javaStream/primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        // 기본 타입 값 읽기
        for(int i=0; i<2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }

        // 입력 스트림 닫기
        dis.close();

    }
}
