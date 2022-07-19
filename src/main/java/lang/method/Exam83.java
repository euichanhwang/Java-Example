package lang.method;

public class Exam83 {

  // 가변 파라미터.
  // [리턴 타입] 메서드명 (타입... 변수) {...}
  // 0개 이상의 값을 받을 때 선언하는 방식.
  // 메서드 내부에서는 배열처럼 사용.
  // 가변 파라미터는 여러 개 선언할 수 없다. -> 아규먼트의 시작과 끝 구분할 수 없음.
  // 가변 파라미터는 반드시 맨 끝에 와야 함.
  static void hello(String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n",names[i]);
    }
  }

  public static void main(String[] args) {

    hello();
    System.out.println("--------------------------");

    hello("홍길동");
    System.out.println("--------------------------");

    hello("a","b","c");
    System.out.println("--------------------------");


    String[] arr = {"a","b","c","d"};
    hello(arr);

  }

}
