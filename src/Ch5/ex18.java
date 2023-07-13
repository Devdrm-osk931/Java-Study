package Ch5;

public class ex18 {
    public static void main(String[] args) {
        int[][] score = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int sum = 0;

        for (int i = 0; i < score.length; i++){
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
            }
        }

        for (int[] tmp : score){
            for (int i:tmp) {
                sum += i;
            }
        }

        System.out.println("sum: " + sum);
    }
}
