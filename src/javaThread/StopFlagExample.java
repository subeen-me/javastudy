package javaThread;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread =new PrintThread1();
        printThread.start();

        try { Thread.sleep(1000);} catch (InterruptedException e ) {}

        printThread.setStop(true); //스레드를 안전하게 종료. stop 피르를 true로 변경
    }
}
