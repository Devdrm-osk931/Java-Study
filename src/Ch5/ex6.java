package Ch5;

import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        System.out.println(Arrays.stream(score).max().getAsInt());
        System.out.println(Arrays.stream(score).min().getAsInt());

        for (int idx = 0; idx < score.length; idx ++) {
            // 최댓값 확인
            if (score[idx] > max) { max = score[idx]; }
            // 최솟값 확인
            if (score[idx] < min ) { min = score[idx]; }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
