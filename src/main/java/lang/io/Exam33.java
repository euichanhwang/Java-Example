package lang.io;

import java.util.Date;

public class Exam33 {
    public static void main(String[] args) {
        // java.lang 패키지의 멤버 사용할 때는 그냥 이름을 지정
        // 그 외 다른 패키지의 멤버 사용할 때는 반드시 패키지 이름을 함께 지정
        Date today = new Date();
        // java.util.Date today = new java.util.Date();

        // %t[날짜 및 시각 옵션]
        System.out.printf("%1$tY,%1$ty\n",today); // 2022 , 22
        System.out.printf("%1$tB,%1$tb\n",today); // 7월, 7월
        System.out.printf("%1$tm",today); // 07

        System.out.println();

        // 년-월-일 시:분:초 출력
        System.out.printf("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n",today); // 2022-07-11 10:17:26




    }
}
