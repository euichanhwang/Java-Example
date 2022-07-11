package lang.variable;

class Myclass {
    int a = 11; // 인스턴스 변수
    static int b = 22; // 클래스 변수

    static void m1(int v1) {
        int v2 = 200; // 로컬 변수 : 블록을 실행할 때 준비되는 변수
        System.out.println(v1);
        System.out.println(v2);
    }
}

public class Exam41 {
    int a; // 인스턴스 변수 : new 명령을 사용하여 인스턴스를 생성할 때 준비되는 변수

    static int b; // 클래스 변수 == 스태틱 변수 : 클래스가 로딩될 때 준비되는 변수

    public static void main(String[] args) {
        Myclass obj1 = new Myclass(); // new 명령이 실행될 때 변수가 준비된다.
        System.out.println(obj1.a); // 인스턴스를 가리키는 참조 변수(레퍼런스) 통해 변수 사용

        System.out.println(Myclass.b); // 클래스를 사용(로딩)하는 시점에 준비됨.

        Myclass.m1(100); // 메서드를 실행할 때 변수가 준비된다.

    }
}
