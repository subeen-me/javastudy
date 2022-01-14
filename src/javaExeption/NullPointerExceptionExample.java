package javaExeption;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null; //null값을 갖고 있기 때문에 String객체를 참조하지 않음
        System.out.println(data.toString()); //String객체의 toString()메소드 호출하면 예외 발생

//        null값을 갖는 참조 변수로 객체 접근 연산자인 도트 . 를 사용했을 때 발생
    }
}
