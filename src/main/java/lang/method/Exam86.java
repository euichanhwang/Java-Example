package lang.method;

public class Exam86 {

  public static void main(String[] args) {
    int result = plus(plus(plus(2,3),4),5);
    System.out.println(result);
  }
  static int plus (int a, int b) {
    return a + b;
  }

}
