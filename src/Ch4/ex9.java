package Ch4;

// while - break
public class ex9 {
    public static void main(String[] args) {
        int randNumber;
        while(true) {
            randNumber = (int)(Math.random() * 6) + 1;
            System.out.println(randNumber);
            if(randNumber == 6) {
                System.out.println("종료");
                break;
            }
        }
    }
}
