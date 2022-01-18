package javaThread;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
