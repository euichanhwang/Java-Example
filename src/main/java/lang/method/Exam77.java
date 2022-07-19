package lang.method;

import java.util.Scanner;
// not using method
public class Exam77 {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = sc.nextInt();
    sc.close();

    int starLen = 1;
    while(starLen <= len) {
      // 별 앞에 공백 출력
      int spaceCnt = 1;
      int spaceLen = (len-starLen) / 2;
      while(spaceCnt <= spaceLen) {
        System.out.print(" ");
        spaceCnt++;
      }

      // 별 출력
      int starCnt = 1;
      while (starCnt <= starLen) {
        System.out.print("*");
        starCnt++;
      }
      System.out.println();
      starLen+=2;
    }
  }

}
