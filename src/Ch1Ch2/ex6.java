package Ch1Ch2;

// Float vs Double
public class ex6 {
    public static void main(String[] args) {
        //실수값 저장
        //float var1 = 3.14; Compile Error
        float var2 = 3.14F;
        double var3 = 3.14;

        //정밀도 테스트
        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
    }
}
