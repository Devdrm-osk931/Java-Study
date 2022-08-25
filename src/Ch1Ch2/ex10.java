package Ch1Ch2;

//Byte Operation
public class ex10 {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println(result1);

        byte x = 10;
        byte y = 20;
        int result2 = x + y;
        System.out.println(result2);

        /*
        정수 연산 시에, 결과는 피연산자 중 더 큰 허용범위를 가진 타입으로 써야함
        int보다 허용범위가 작은 byte, short의 경우 연산 시, 자동으로 int형으로 변환되어 계산됨
        따라서 결과를 담는 result2 변수의 경우 int형으로 선언이 되어야함!
         */


    }
}
