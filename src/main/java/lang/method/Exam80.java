package lang.method;

import java.util.Scanner;

public class Exam80 {


  static void printSpace(int len) {
    for (int i=0; i<len; i++) {
      System.out.print(" ");
    }

  }
  static void printStars(int len) {
    for (int i=0; i<len; i++) {
      System.out.print("*");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    sc.close();

    for (int starLen = 1; starLen <= len; starLen += 2) {
      printSpace((len-starLen)/2);
      printStars(starLen);
      System.out.println();
    }



  }

}
