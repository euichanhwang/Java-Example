package lang.variable;

public class Exam16 {
    //escape character = 문자 제어 코드
    //화면에 출력하는 문자가 아니라 문자 출력을 제어하는 문자.
    // \n - Line Feed, 0x0a
    // \r - Carriage Return, 0x0d
    public static void main(String[] args) {
        System.out.println("Hello,world!");
        System.out.println("Hello,\nworld!");
        System.out.println("Hello,\rabc"); //커서(cursor) 를 처음으로 돌리는 문자

        System.out.println("Hello,\b\b\bworld!"); //Backspace
        System.out.println("Hello,\tworld!"); //tab
        System.out.println("Hello,\fworld!"); //form feed.프린트 출력시 이번 페이지를 마치고 다음 페이지로 넘기기 위해서 사용.
        System.out.println("Hello,\"w\"orld!"); // \"로 "출력
        System.out.println("Hello,'w'orld!"); //" " 안에서 ' 문자는 그냥 적는다
        System.out.println('\''); // '
        System.out.println('"'); // "
        System.out.println("c:\\Users\\user\\git"); // \문자를 출력시키는 문자


    }
}
