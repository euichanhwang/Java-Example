package lang.io;

import java.util.Scanner;

public class Exam37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("나이? ");
        int age = sc.nextInt();
        // nextInt() 는 한 개의 토큰을 읽은 후에 줄 바꿈 코드는 읽기 전 상태로 냅둠.
        // 따라서 다음에 nextLine()을 호출하면 의도치 않게 빈 문자열을 가진 한 줄을 읽는다.
        // nextInt() 다음에 nextLine() 호출하면 이런 상황 발생 -> nextInt() 다음에 nextLine() 호출한 후 남아있는 엔터 코드를 제거
        sc.nextLine();

        System.out.printf("이름? ");
        String name = sc.nextLine();

        sc.close();
        System.out.printf("%d(%s)\n",age,name);

    }
}
