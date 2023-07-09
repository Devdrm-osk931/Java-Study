package Ch5;

public class ex7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        // 0 ~ 9 숫자로 초기화
        for (int idx = 0; idx < numArr.length; idx ++) {
            numArr[idx] = idx;
        }

        System.out.println();

        for (int i = 0; i < 100; i ++) {
            // 0 ~ 9 까지의 숫자를 랜덤으로 선정
            int n = (int) (Math.random() * numArr.length);

            // numArr[0] 과 numArr[tmp] 바꿔치기
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        System.out.println("Shuffle 확인");
        for (int idx = 0; idx < numArr.length; idx ++) {
            System.out.println("numArr[" + idx + "]: " + numArr[idx]);
        }
    }
}
