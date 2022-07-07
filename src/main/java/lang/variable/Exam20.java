package lang.variable;

import java.util.Scanner;

public class Exam20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 클래스의 객체를 생성
        String input = sc.nextLine(); // 입력받은 내용을 input에 저장

        int num1 = Integer.parseInt(input); // 입력받은 내용을 int타입의 정수로 변환
        int num2 = sc.nextInt(); // 정수를 입력받아서 num2에 저장
        System.out.println(num1);
        System.out.println(num2);

    }
}
