package Ch5;

public class ex17 {
    public static void main(String[] args) {
        if (args.length != 3) {  // arg의 길이가 3이 아니라면
            System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);  // 문자열을 숫자로 변환한다
        char op = args[1].charAt(0);  // args[1] 의 0번째 인덱스에 있는 문자를 변환
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch(op)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("지원되지 않는 연산입니다.");
                break;

        }

        System.out.println("결과: " + result);
    }
}
