package Ch5;

// 배열 복사
public class ex3 {

    public static void main(String[] args){
        int[] arr = new int[5];

        // 배열에 1 ~ 5 숫자 저장
        for (int idx = 0; idx < arr.length; idx ++) {
            arr[idx] = idx + 1;
        }

        System.out.println("변경 전");
        for (int idx = 0; idx < arr.length; idx ++) {
            System.out.println("arr[" + idx + "]: " + arr[idx]);
        }

        // 기존 arr 길이의 두배 되는 임시 배열을 만든 뒤, 기존 요소들 복사
        int[] tmp = new int[arr.length * 2];

        for(int idx = 0; idx < arr.length; idx ++) {
            tmp[idx] = arr[idx];
        }

        // 기존에 arr 의 참조 주소를 tmp 참조 주소로 바꾼다
        arr = tmp;

        System.out.println("변경 후");
        for(int idx = 0; idx < arr.length; idx ++) {
            System.out.println("arr[" + idx + "]: " + arr[idx]);
        }
    }
}
