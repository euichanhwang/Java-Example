package lang.overloding;

class OverloadingTest {
    // Overloading
    // 한 클래스 내에서 이미 사용하려는 이름과 같은 이름 가진 메소드 있더라도 매개변수의 개수 또는 타입이 다르면,
    // 같은 이름 사용해서 메소드 정의할 수 있다.

    // 메소드의 이름이 같고, 매개변수의 개수나 타입이 달라야 한다. '리턴 값'만 다른 것은 오버로딩 불가
    public static void main(String[] args) {
        OverloadingMethods om = new OverloadingMethods();
        om.print();
        System.out.println(om.print(3));
        om.print("Hello");
        System.out.println(om.print(4,5));
    }
}
class OverloadingMethods {
    // 오버로딩은 매개변수의 차이로만 구현 가능
    public void print(){
        System.out.println("오버로딩1");
    }
    String print(Integer a){
        System.out.println("오버로딩2");
        return a.toString();
    }
    void print(String a){
        System.out.println("오버로딩3");
        System.out.println(a);
    }
    String print(Integer a,Integer b) {
        System.out.println("오버로딩4");
        return a.toString() + b.toString();
    }

}
