package javaThread;

import java.awt.*;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000); // 3초동안 메인 스레드를 일시정지 상태로 만듬
            } catch (InterruptedException e ) {}
        }
    }
}
