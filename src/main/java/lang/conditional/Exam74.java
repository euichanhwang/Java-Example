package lang.conditional;

import java.util.Scanner;

public class Exam74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        char gender = regNo.charAt(7); // 8번째 문자를 gender에 저장

        switch (gender) {
            case '1': case '3':
                System.out.println("당신은 남자입니다\n");
                break;
            case '2': case '4':
                System.out.println("당신은 여자입니다\n");
                break;
            default:
                System.out.println("유효하지 않은 주민번호입니다.");
        }
    }
}
