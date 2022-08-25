package Ch4;

//Random Number Example
public class ex2 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i ++) {
            int randNum = (int)(Math.random() * 6) + 1;
            System.out.println(randNum);
        }
    }
}
