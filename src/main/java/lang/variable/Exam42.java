package lang.variable;

public class Exam42 {
    public static void main(String[] args) {
        // 정수는 부동소수점 메모리에 저장할 수 있다.
        // 부동소수점 메모리의 유효자릿수를 넘어가는 정수를 저장할 경우 값이 짤린다. 그럼에도 컴파일 오류가 발생하지 않는다.

        float f = 3.14f;
        double d = 9876.56789;
        // 부동소수점 메모리의 값을 정수 메모리에 저장할 수 없다. 정수 메모리는 소수점 이하의 값을 저장할 수 없기 때문에
        // 자바에서는 부동소수점 값을 정수 메모리에 저장하는 것을 문법에서 막는다.
        // int i = f; 컴파일 에러
        // long l = d; 컴파일 에러

    }
}
