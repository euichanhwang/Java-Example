package lang.method;

import java.util.Scanner;
// N-1 개 원판을 1번에서 2번으로
// n번 원판을 1번에서 3번으로
// n-1 개 원판을 2번에서 3번으로

public class HanoiTower {

  static void hanoi(int n,int start,int mid,int end) {
    if (n==1) {
      System.out.println(start + " " + end);
      return;
    }
    else {
      hanoi(n-1,start,end,mid);
      System.out.println(start + " " + end);
      hanoi(n-1,mid,start,end);
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 원판의 개수
    System.out.println((1<<n)-1);
    hanoi(n,1,2,3);

  }

}
