package lang;

public class Exam09 {
    public static void main(String[] args) {
        // 덧셈 연산자를 이용하여 문자열을 결합할 수 있다.
        // 피연산자 중 어느 한쪽이 String이면 나머지 한 쪽을 먼저 String으로 변환한 다음 두 String을 결합한다.
        String name = "Ja" + "va";
        String str = name + 8.0;
        System.out.println("name = " + name); //Java
        System.out.println("str = " + str); //Java8.0
    }
}
