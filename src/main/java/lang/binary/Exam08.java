package lang.binary;

public class Exam08 {
    public static void main(String[] args) {
        //p를 이용해 실수 리터럴 16진 지수형태 표시.
        //p는 2의 제곱을 의미. p의 왼쪽에는 16진수, 오른쪽에는 지수를 10진수 정수로 적는다.
        System.out.println(0x1p1);// 1.0 * 2 = 2.0
        System.out.println(0x0.2p-1);// 0.125 * 0.5 = 0.0625
        System.out.println(0x12p3); // 18*8=144.0
    }
}
