package Ch4;

import java.util.Scanner;

//SwitchCharExample
public class ex4 {
    public static void main(String[] args) {
        char grade = 'B';

        switch(grade) {
            case 'A':
                System.out.println("A");
            case 'a':
                System.out.println("잘했어요");
                break;
            case 'B':
                System.out.println("B");
            case 'b':
                System.out.println("아슬아슬했어요");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("재수강!");
                break;
        }

        System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하시오>> ");
        Scanner scanner = new Scanner(System.in);

        int user = scanner.nextInt();
        int com = (int)(Math.random()) + 1;

        System.out.println("당신의 선택은 " + user + "입니다.");
        System.out.println("컴퓨터의 선택은 " + com + "입니다.");

        switch(user - com) {
            case 2: case -1:
                System.out.println("YOU LOSE");
                break;
            case 1: case -2:
                System.out.println("YOU WIN");
                break;
            case 0:
                System.out.println("DRAW");
                break;
        }

        System.out.println("당신의 주민등록번호를 입력하세요 >> ");
        String regNo = scanner.next();
        int gender = Character.getNumericValue(regNo.charAt(7));
        System.out.println("gender = " + gender);
        if (gender == 1 || gender == 3) {
            System.out.println("MAN");
        }
        else if (gender == 2 || gender == 4) {
            System.out.println("WOMAN");
        }
        else {
            System.out.println("WRONG NUMBER");
        }
    }
}
