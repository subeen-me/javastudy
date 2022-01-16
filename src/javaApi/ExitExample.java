package javaApi;

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.exit(0); //현재 실행하고 있는 프로세스를 강제 종료
                //break;          // 종료될 때 마무리 코드를 실행해야 한다면 for문을 빠져나오는 break문을 사용하는게 좋다.
            }
        }
        System.out.println("마무리 코드"); //프로그램이 강제종료되었기 때문에 출력되지 않는다.
    }
}
