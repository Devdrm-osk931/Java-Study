package Ch1Ch2;

// 자동 형 변환(Promotion)
// 큰 허용범위 타입 = 작은 혀용범위 타입 --> 자동으로 형 변환 일어남
public class ex8 {
    public static void main(String[] args) {
        //Promotion
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);

    }
}
