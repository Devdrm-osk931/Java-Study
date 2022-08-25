package Ch4;

//For Loop Example 2
public class ex6 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for(i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 ~ " + (i-1) + "까지의 합 = " + sum);
    }
}
