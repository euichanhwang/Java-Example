package lang.operator;

public class Exam48 {
    public static void main(String[] args) {
        char c1 = 'a';
        // char c2 = c1+1; 컴파일 에러. 수식에 변수가 들어가 있는 경우 컴파일러가 미리 계산을 할 수 없음.
        char c2 = (char)(c1+1); // 가능
        char c3 = 'a'+1; // 리터럴 간의 연산. 가능

        // 대문자를 소문자, 소문자를 대문자로
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase-32);
        System.out.println(upperCase);

        double pi = 3.141592;
        double shortPi = Math.round(pi*1000) / 1000.0;
        System.out.println(shortPi);
        // round 메서드는 매개변수로 받은 값을 소수점 첫째자리에서 반올림. 그 결과를 정수로 돌려주는 메서드 

    }
}
