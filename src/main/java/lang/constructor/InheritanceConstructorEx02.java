package lang.constructor;

/**
 * 1.부모 클래스의 생성자는 상속되지 않고, 자식 클래스로 인스턴스를 생성할 때 자동적으로 부모의
 * 기본 생성자가 호출.
 * 2. 부모 생성자가 매개변수를 갖고 있다면 자식 클래스를 인스턴스화할 때 자동으로 호출되지 않는다.
 * 3. 따라서 자식 생성자에서 명시적으로 부모 생성자를 호출해야 함. 이때 super 사용. super()는 자식 생성자의 첫 줄에 위치
 */
class Superclass1 {
  public Superclass1(String str) {
    System.out.println(str + "호출");
  }
}
class Subclass1 extends Superclass1 {

  public Subclass1(String str) {
    super("부모 생성자 "); // super : 부모. 자식 클래스 생성자의 첫 줄에 위치하여야 함
    System.out.println("자식 생성자 호출");
  }
}

public class InheritanceConstructorEx02 {

  public static void main(String[] args) {
    Subclass sc = new Subclass();

  }

}
