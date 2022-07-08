package lang.variable;

public class Exam23 {
    public static void main(String[] args) {
        int a1,a2 = 200, a3, a4= 400, a5;
        System.out.println("a2 = " + a2);
        System.out.println("a4 = " + a4);

        int age;
        // System.out.println(age); 값이 저장되지 않은 변수를 사용하면 문법 오류

        // 4byte 리터럴인 경우 메모리 크기에 상관없이 저장할 수 있다면 byte,short 메모리에 저장해도 컴파일 오류 발생하지 않음.
        byte b = 127;
        short s = 32767;

    }
}
