package lang.io;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardApp {
    public static void main(String[] args) {
        System.out.println("[게시판 어플리케이션!]");
        System.out.println();
        System.out.println("환영합니다!");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        final int SIZE = 3;
        int[] num = new int[1000];
        String[] title = new String[SIZE];
        String[] content = new String[SIZE];
        String[] writer = new String[SIZE];
        String[] password = new String[SIZE];
        int[] viewCount = new int[SIZE];
        long[] createdDate = new long[SIZE];

        int boardCount = 0; // 지정된 게시글의 개수를 담는 변수

        while (true) {
            System.out.println("메뉴:");
            System.out.println("  1: 게시글 목록");
            System.out.println("  2: 게시글 상세보기");
            System.out.println("  3: 게시글 등록");
            System.out.println();
            System.out.print("메뉴를 선택하세요[1..3](0: 종료) ");

            int menuNum = sc.nextInt();
            sc.nextLine();
            if(menuNum == 0) break;
            else if (menuNum == 1) {
                System.out.println("[게시글 목록]");
                System.out.println("번호 제목 조회수 작성자 등록일");

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                for(int i=0;i<boardCount;i++){
                    // Date date = new Date(CreatedDate[i])
                    String dateStr = simpleDateFormat.format(new Date(createdDate[i]));
                    System.out.printf("%d\t%s\t%d\t%s\t%s\n", num[i], title[i], viewCount[i]
                            , writer[i], dateStr);
                }

            } else if (menuNum == 2) {
                System.out.println("[게시글 상세보기]");
                System.out.print("조회할 게시글 번호는 몇 번입니까? ");

                String input = sc.nextLine();
                int boardNum = Integer.parseInt(input); // 조회할 게시글 번호

                int boardIndex = -1;
                for(int i=0; i < boardCount; i++){
                    if (num[i]==boardNum){
                        boardIndex = i;
                        i++;
                    }
                }

                if (boardIndex == -1) {
                    System.out.println();
                    System.out.println("해당 번호의 게시글이 없습니다.");
                    continue;
                }
                System.out.printf("번호: %d\n", num[boardIndex]);
                System.out.printf("제목: %s\n", title[boardIndex]);
                System.out.printf("내용: %s\n", content[boardIndex]);
                System.out.printf("조회수: %d\n", viewCount[boardIndex]);
                System.out.printf("작성자: %s\n", writer[boardIndex]);
                java.util.Date date = new java.util.Date(createdDate[boardIndex]);
                System.out.printf("등록일: %1$tY-%1$tm-%1$td %1$tH:%1$tM\n", date);


            } else if (menuNum == 3) {
                System.out.println("[게시글 등록]");
                if(boardCount == SIZE){
                    System.out.println("게시글을 더 이상 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("제목:  ");
                title[boardCount] = sc.nextLine();

                System.out.print("내용:  ");
                content[boardCount] = sc.nextLine();

                System.out.print("작성자:  ");
                writer[boardCount] = sc.nextLine();

                System.out.print("암호:  ");
                password[boardCount] = sc.nextLine();
                if (boardCount == 0){
                   num[boardCount] = 1;
                }
                else {
                    num[boardCount] = num[boardCount-1]+1;
                }
                viewCount[boardCount] = 0;
                createdDate[boardCount] = System.currentTimeMillis();
                boardCount++;
            } else {
                System.out.println("메뉴 번호가 옳지 않습니다.");
            }
        }
        System.out.println("bye");
    }
}
