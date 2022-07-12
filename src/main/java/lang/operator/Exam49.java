package lang.operator;

public class Exam49 {
    public static void main(String[] args) {
        byte b;
        b = 5;
        b = 6; // 리터럴 5,6은 4바이트 정수 값. byte 변수에 저장할 수 있다면 가능 .
        b = 5+6; // 리터럴끼리 산술 연산한 결과도 리터럴로 간주한다. 그 결과 값이 변수의 범위 내의 값이면 허락함.
        System.out.println(b);

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        long r2 = (long)x + (long)y;
        System.out.println(r2); // int 와 int 연산 결과가 int 크기를 넘어갈 것 같으면 형변환하여 계신

        byte b1;
        // b1 = 260; 컴파일 오류.
        b1 = (byte)259;
        System.out.println(b1); // 3
        // 큰 메모리의 값을 작은 메모리에 넣으려고 형변환 사용. 값이 잘릴 수 있음


    }
}
