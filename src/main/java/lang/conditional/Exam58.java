package lang.conditional;

import java.util.Scanner;

public class Exam58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level =  sc.nextInt();

        final int GUEST = 0, MEMBER = 1, ADMIN = 2;
        switch (level){
            case GUEST :
                System.out.println("조회만 가능합니다");
                break;
            case MEMBER:
                System.out.println("글 작성이 가능합니다");
                break;
            case ADMIN:
                System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
                break;
            default:
                System.out.println("올바른 번호를 입력하세요");
        }
    }
}
