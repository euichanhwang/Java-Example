package lang.io;

import java.io.InputStream;
import java.util.Scanner;

public class Exam35 {
    public static void main(String[] args) {
        InputStream keyboard = System.in;
        Scanner keyboardScanner = new Scanner(keyboard); // Scanner 객체 생성
        System.out.print("이름? ");
        System.out.println(keyboardScanner.nextLine());
        System.out.print("전화? ");
        System.out.println(keyboardScanner.nextLine());
        System.out.print("이메일? ");
        System.out.println(keyboardScanner.nextLine());
        System.out.print("나이? ");
        System.out.println(keyboardScanner.nextLine());
        System.out.print("재직여부 ?");
        System.out.println(keyboardScanner.nextLine());

        keyboardScanner.close();

    }
}
