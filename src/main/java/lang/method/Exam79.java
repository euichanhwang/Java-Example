package lang.method;

import java.util.Scanner;

public class Exam79 {

  private static void extracted(int starLen) {
    int starCnt = 1;
    while (starCnt <= starLen) {
      System.out.print("*");
      starCnt++;
    }
  }


  static void printSpace(int len) {
    int spaceCnt = 1;
    while (spaceCnt <= len) {
      System.out.print(" ");
      spaceCnt++;
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
      printSpace((len - starLen) / 2);

      // 별 출력
      extracted(starLen);
      System.out.println();
      starLen += 2;
    }

  }


}
