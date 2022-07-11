package lang.io;

import java.util.Scanner;

public class Exam38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("나이, 이름, 취업여부? ");
        int age = sc.nextInt();
        String name = sc.next(); // 한 개의 토큰을 읽을 때 유용
        boolean working = sc.nextBoolean();

        sc.close();
        System.out.printf("%d,%s,%b\n",age,name,working);
    }
}
