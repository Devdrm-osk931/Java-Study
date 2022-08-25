package Ch4;

//Switch Example
public class ex3 {
    public static void main(String[] args) {
        int randNumber = (int)(Math.random() * 6) + 1;

        switch(randNumber) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("6");
                break; // 마지막 케이스의 경우 이후에 수행할 케이스가 없기 때문에 break가 없어도 괜찮음
        }
    }
}
