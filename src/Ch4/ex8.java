package Ch4;

//While Example
public class ex8 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10) {
            System.out.println(++i);
        }

        i = 0;
        int sum = 0;
        while(i < 100) {
            i++;
            sum += i;
        }
        System.out.println(sum);
    }
}
