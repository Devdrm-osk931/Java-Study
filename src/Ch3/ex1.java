package Ch3;

public class ex1 {
    public static void main(String[] args) {
        //SimpleOperatorExample
        int x = -100;
        int result1 = +x;
        int result2 = -x;

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        byte y = 100;
        //byte result = -y;
        int result3 = -y;
        System.out.println("result3: " + result3);

        //Increase Decrease Operator
        x = 10;
        y = 10;
        int z;

        System.out.println("------------------------");
        x++;
        ++x;
        System.out.println("x = " + x); // 12
        System.out.println("------------------------");
        y--;
        --y;
        System.out.println("y = " + y); // 8
        System.out.println("------------------------");
        z = x++; // 12
        System.out.println("z = " + z);
        System.out.println("x = " + x); // 13
        System.out.println("------------------------");

        //DenyLogicOperatorExample
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);

    }
}
