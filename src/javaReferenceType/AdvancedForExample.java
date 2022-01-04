package javaReferenceType;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        for(int score : scores) {
            sum = sum + score;
        } // for문의 반복 횟수는 배열의 항목 수가 된다.
        System.out.println("총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 : " + avg);
    }
}
