package Ch5;

// System.arraycopy() 메소드를 통한 배열 복사
public class ex4 {

    public static void main(String[] args) {
        /*
        System.arraycopy() 형태
        System.arraycopy(num, i, newNum, j, num.length)
        > num[i]에서 newNum[j]으로 num.length 개의 데이터 복사
        > 인덱스 잘못 설정 시 ArrayIndexOutOfBoundsException 발생
         */

        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // abc 와 num을 붙여서 하나의 배열(result) 로 만든다
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // 배열 abc을 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        // number의 인덱스 6 위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(abc);
    }
}
