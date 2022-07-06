package lang;
//상수도 변수와 마찬가지로 '값을 저장할 수 있는 공간' + 한번 값을 저장하면 다른 값으로 변경할 수 없다.
public class Exam07 {
    public static void main(String[] args) {
        final int MAX_SPEED = 10; //상수 MAX_SPEED 를 선언 + 초기화
        //final int MAX_SPEED; 에러. 상수는 선언과 동시에 초기화해야 함
        //MAX_SPEED = 200; 에러. 상수의 값은 변경할 수 없음

        //리터럴 = 그 자체로 값을 의미하는 것
        //int year(변수) = 2014(리터럴);
        //fianl int MAX_VALUE(상수) = 100(리터럴);

    }

}