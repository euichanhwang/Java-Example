package lang.conditional;

import java.util.Scanner;

public class Exam57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[지원부서]");
        System.out.println("1.S/W 개발");
        System.out.println("2.일반관리");
        System.out.println("3.시설경비");
        System.out.println("지원 분야의 번호를 입력하세요 ");
        int num = sc.nextInt();

        System.out.println("제출하실 서류는 다음과 같습니다.");
        switch (num){
            case 1:
                System.out.println("정보처리자격증");
            case 2:
                System.out.println("졸업증명서");
            case 3:
                System.out.println("이력서");
                break;
            default:
                System.out.println("올바른 번호를 입력하세요");
        }
        sc.close();
    }
}
