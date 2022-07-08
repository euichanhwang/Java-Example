package lang.variable;

public class Exam24 {

    public static void main(String[] args) {
        float f = 9876545.6f;
        System.out.println("f = " + f);

        // 4byte 크기를 넘어가는 부동소수점 리터럴은 이미 짤린 값이기 때문에 제대로 저장될 수 없다.
        double d = 99999.8888877777f;
        System.out.println("d = " + d); // d = 99999.890625

        // 정수의 경우 리터럴을 표현할 때 값이 그 크기를 넘어가면 컴파일 오류가 발생
        // 그러나 부동소수점의 경우 리터럴이 메모리의 크기를 넘어갈 때 컴파일 오류 대신 값이 잘림.

        // 4byte 부동소수점을 8byte 메모리에 저장할 때
        // 계산 방식에 의해 소수점 이하의 수가 근사 값으로 바뀐다.
        d = 99999.88f;
        System.out.println("d = " + d); // d = 99999.8828125
    }
}
