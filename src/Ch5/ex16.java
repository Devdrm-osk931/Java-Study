package Ch5;

public class ex16 {
    public static void main(String[] args) {
        if (args != null) {
            System.out.println("매개변수의 갯수: " + args.length);

            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "]: " + args[i]);
            }
        }
    }
}
