package lang.overloding;

public class OverridingTest {
    // 오버라이딩은 부모 클래스의 메소드를 재정의.
    // 오버라이딩 하고자 하는 메소드의 이름, 매개변수, 리턴 값이 모두 같아야 함.
    public static void main(String[] args) {
        Person person = new Person();
        Child child = new Child();
        Senior senior = new Senior();

        person.cry();
        child.cry();
        senior.cry();
    }
}
class Person {
    void cry(){
        System.out.println("흑흑");
    }
}
class Child extends Person {
    @Override
    protected void cry(){
        System.out.println("잉잉");
    }
}
class Senior extends Person {
    @Override
    public void cry() {
        System.out.println("훌쩍훌쩍");
    }
}
