package lang.io;

public class Exam34 {
    public static void main(String[] args) {
        // 키보드 입력 받기 - System.in, java.util.Scanner
        java.io.InputStream keyboard = System.in;
        /**
         * InputStream 은 바이트 단위로 읽는 기능이 있다.
         * 바이트 단위로 읽어서 int나 문자열로 바꾸려면 또 코딩해야 함.
         * 이런 불편함을 줄이기 위해 바이트를 개발자가 원하는 값으로 바꿔주는 도구 -> java.util.Scanner
         */
        java.util.Scanner keyboardScanner = new java.util.Scanner(keyboard);
        // 사용자가 엔터키 누르면 입력값으로 0d0a 2바이트 값이 들어오고, nextLine()은 그 전까지 들어온 데이터 문자열로 만들어 리턴.
        String str = keyboardScanner.nextLine();

        System.out.println(str);
        keyboardScanner.close();
    }
}
