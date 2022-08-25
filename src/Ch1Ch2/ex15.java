package Ch1Ch2;

//Printf Example
public class ex15 {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격 %d 원\n", value);
        System.out.printf("상품의 가격 %6d 원\n", value);
        System.out.printf("상품의 가격 %-6d 원\n", value);
        System.out.printf("상품의 가격 %06d 원\n", value);

        double value2 = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f", 10, value2);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }

}
