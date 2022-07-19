package lang.method;

public class Exam81 {
  static String hello() {
    return "안녕하세요!";
  }

  public static void main(String[] args) {
    String r = hello();
    System.out.println(r);
    System.out.println(hello());

    hello(); // 값을 받는 변수가 없으면 리턴 값은 버려진다.
  }

}
