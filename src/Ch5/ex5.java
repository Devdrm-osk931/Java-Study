package Ch5;

import java.util.Arrays;
import java.util.OptionalDouble;

// 총합, 평균
public class ex5 {
    public static void main(String[] args) {

        /*
        // 그냥 혼자 해본것 //
        int sum = 0;           // 총점을 저장하기 위한 변수
        OptionalDouble avg = OptionalDouble.of(0);        // 평균을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        sum = Arrays.stream(score).sum();
        avg = Arrays.stream(score).average();

        System.out.println(sum);
        System.out.println(avg.getAsDouble());

        */

        int sum = 0;
        float avg = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int idx = 0; idx < score.length; idx ++){
            sum += score[idx];
        }

        avg = sum / (float)score.length;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
