package lang.method;

import java.util.Scanner;

public class Exam89 {

  static void printSpace(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print(" ");
    }
  }


  static void printStars(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print("*");
    }
  }
  static int getSpaceLength(int totalStar, int displayStar) {
    return (totalStar - displayStar)/2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = sc.nextInt();
    sc.close();

    for (int starLen = 1; starLen <= len; starLen += 2) {
      printSpace(getSpaceLength(len,starLen));
      printStars(starLen);
      System.out.println();
    }
  }

}
