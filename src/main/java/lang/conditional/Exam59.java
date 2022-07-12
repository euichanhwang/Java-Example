package lang.conditional;

public class Exam59 {
    enum Level {
        GUEST,MEMBER,ADMIN
    }

    public static void main(String[] args) {
        Level level = Level.MEMBER;
        switch (level) {
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
