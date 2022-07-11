package lang.io;

import java.util.Scanner;

public class Exam39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("입력: ");

        // next()
        // 토큰 단위로 입력 데이터를 잘라서 읽을 때 유용함.
        String token1 = sc.next();
        String token2 = sc.next();
        String token3 = sc.next();
        sc.close();

        System.out.printf("%s, %s, %s\n",token1,token2,token3 );
    }
}
