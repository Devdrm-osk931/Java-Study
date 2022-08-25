package Ch1Ch2;

// IntegerLiteralExample
public class ex2 {
    public static void main(String[] args) {
        int var1 = 0b1011;  //2진수 0b OR 0B
        int var2 = 0206;  //8진수 0
        int var3 = 365;  //10진수
        int var4 = 0xB3;  //16진수 0x
        long var5 = 10;
        long var6 = 20L;
        long var7 = 10000000000L;  //int(4byte) 허용범위를 넘어간다면 type 이 long 이더라도 L 을 적어서 알려주어야함


        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
