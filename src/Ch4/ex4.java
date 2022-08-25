package Ch4;

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
    }
}
