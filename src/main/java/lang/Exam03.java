package lang;

public class Exam03 {
    public static void main(String[] args) {
        System.out.println("애노테이션");
    }

    /**
     * @Override
     * super class에서 상속 받은 멤버를 '재정의' 한다는 것은 컴파일러에게 알린다.
     * 컴파일러는 오버라이딩 규칙을 준수하는지 검사
     * 오버라이딩 규칙을 따르지 않는다면 컴파일 오류 발생.
     */
    @Override
    public String toString(){
        return "Exam03";
    }
}
