package javaIftofor;

public class ForMultiplicationExample {
    public static void main(String[] args) {
        for(int m = 1; m<=10; m++) {
            for(int n = 1; n<=10; n++) {
                if((4 * m + 5 * n) ==60) {
                    System.out.println("(" + m + "," + n + ")");
                }
            }
        }
    }
}
