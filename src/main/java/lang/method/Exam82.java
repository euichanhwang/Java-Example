package lang.method;

public class Exam82 {
  static String hello(String name, int age) {
    String retVal = String.format("%d살 %s님을 환영합니다!", age, name);
    return retVal;
  }

  public static void main(String[] args) {
    String r = hello("홍길동",20);
    System.out.println(r);

    System.out.println(hello("홍길동",20));

    hello("임꺽정",30);
  }

}
