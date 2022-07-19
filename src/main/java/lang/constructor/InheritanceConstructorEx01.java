package lang.constructor;

/**
 * 자식 클래스로 인스턴스를 생성할 때 부모클래스의 기본 생성자를 자동으로 호출
 * 부모 클래스의 생성자가 먼저 호출되고 뒤이어 자식 클래스의 생성자가 호출된다.
 */
class Superclass {

  public Superclass() {
    System.out.println("부모 생성자 호출");
  }
}
class Subclass extends Superclass {

  public Subclass() {
    System.out.println("자식 생성자 호출");
  }
}
public class InheritanceConstructorEx01 {

  public static void main(String[] args) {
    Subclass sc = new Subclass();
  }

}
