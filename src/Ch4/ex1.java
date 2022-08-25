package Ch4;

import java.util.Scanner;

//IfExample
public class ex1 {
    public static void main(String[] args) {
        int score;
        Scanner scanner = new Scanner(System.in);
        System.out.print("성적입력:");
        score = scanner.nextInt();

        if(score > 90) {
            System.out.println("A");
        }
        else if (score > 80) {
            System.out.println("B");
        }
        else if (score > 70) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
