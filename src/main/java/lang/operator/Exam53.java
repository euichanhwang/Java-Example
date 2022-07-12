package lang.operator;

public class Exam53 {
    public static void main(String[] args) {
        System.out.println(3<<1); // 6
        System.out.println(3<<33); // 6
        System.out.println(3<<65); // 6
        System.out.println(3<<97); // 6
        // 33비트, 65비트, 97비트 이동 같은 값 나오는 이유
        // int 타입의 값에 대해 비트 이동을 할 때는 0~31까지만 유효 -> 31을 넘는 경우 32로 나눈 나머지 값을 비트 이동으로 간주.
        // long 타입의 경우 비트 이동은 0~63까지 유효. -> 63을 넘는 경우 64로 나눈 나머지 값을 비트 이동으로 간주
    }
}
