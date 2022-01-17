package javaApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString(); // 영문으로 된 날짜를 리턴
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 mm분 ss초");
        String strNow2 = sdf.format(now); //sdf로 객체를 얻고 format()메소드를 호출해서 원하는 형식의 날짜 정보를 얻는다. 매개값은 Date객체
        System.out.println(strNow2);
    }
}
