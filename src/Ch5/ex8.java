package Ch5;

public class ex8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // 배열에 1 ~ 45 값 저장
        for (int idx = 0; idx < ball.length; idx++) {
            ball[idx] = idx + 1;
        }

        int temp = 0;
        int j = 0;

        for(int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for(int i = 0; i < 6; i ++) {
            System.out.println("ball[" + i + "]: " + ball[i]);
        }
    }
}
