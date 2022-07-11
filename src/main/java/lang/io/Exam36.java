package lang.io;

import java.util.Scanner;

public class Exam36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("int: ");
        int i = sc.nextInt();
        // nextInt()는 한 개의 토큰(token)을 읽을 때까지 기다린다.
        // 한 개의 token 을 읽으면 4바이트 정수 값으로 바꾼 다음에 리턴.
        // 토큰이란 공백으로 구분되는 단어. 중간에 여러 개의 공백이 들어가더라도 한 개의 공백으로 간주.
        System.out.printf("float: ");
        float f = sc.nextFloat();

        System.out.printf("boolean: ");
        boolean b = sc.nextBoolean();

        sc.close();
        System.out.printf("%d,%f,%b\n",i,f,b);

    }
}
