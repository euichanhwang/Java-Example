package lang.method;

import java.util.Scanner;

public class Exam90 {

  static void printSpace(int len) {
    int spaceCnt = 1;
    while (spaceCnt <= len ) {
      System.out.print(" ");
      spaceCnt++;
    }
  }
  static void printStars(int len) {
    int starCnt = 1;
    while (starCnt <= len) {
      System.out.print("*");
      starCnt++;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = sc.nextInt();
    sc.close();

    int starLen = 1;
    while (starLen <= len) {
      // 별 앞에 공백 출력
      printSpace((len-starLen)/2);
      // 별 출력
      printStars(starLen);
      // 출력 줄 바꾸기
      System.out.println();
      starLen += 2;
    }
  }
}
