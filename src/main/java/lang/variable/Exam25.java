package lang.variable;

public class Exam25 {
    public static void main(String[] args) {
        // 자바는 'UCS(Universal Character Set)' 이라는 국제 표준 문자 인코딩 규격에 따라 문자를 다룬다.
        // UCS-2 라고도 부르며, 각 글자는 0~65535 까지의 16비트 코드 값으로 저장.

        // 자바는 UCS-2 코드 값을 저장하기 위해 2byte 크기의 메모리를 사용.

        // 문자 'A'의 UCS-2 코드 값을 저장.
        char c1,c2,c3;
        c1 = 65; // 문자 'A'의 코드 값을 10진수로 표현
        c2 = 0x41;// 문자 'A'의 코드 값을 16진수로 표현
        c3 = 0b0100_0001; // 문자 'A'의 코드 값을 2진수로 표현

        // 변수의 종류가 char 이면 출력할 때 코드 값 대신 문자 출력.
        // 해당 코드의 문자를 폰트 파일에서 찾아 출력
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // 문자의 UCS-2 코드 확인
        // 정수 변수를 사용하면 문자의 코드 값을 받아서 그대로 출력 가능
        // println()은 int 변수의 값을 10진수로 출력
        int i = 'A';
        System.out.println(i); // 65
    }
}
