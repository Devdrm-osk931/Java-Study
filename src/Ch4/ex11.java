package Ch4;

//Continue Example
public class ex11 {
    public static void main(String[] args) {
        int i = 0;
        for(i = 0; i <= 10; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
