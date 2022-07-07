package lang.variable;

import java.util.Scanner;

public class Exam21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("두자리 정수를 하나 입력해주세요.>");
        String input = in.nextLine();
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
        //숫자가 아닌 문자 또는 기호를 입력하면, 입력받은 문자열을 숫자로 변환하는 과정인 Integer.parseInt()에서 에러가 발생한다.

        System.out.println("입력내용 :"+input);
        System.out.printf("num=%d\n",num);
    }
}
