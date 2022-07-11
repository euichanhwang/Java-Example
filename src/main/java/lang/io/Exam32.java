package lang.io;

public class Exam32 {
    public static void main(String[] args) {
        // %[n$]s : n은 문자열에 삽입될 값의 순서. 순서는 1부터 증가
        System.out.printf("%d %1$x %1$c\n",65); // 65 41 A
        System.out.printf("%3$d %1$x %2$c\n",65,66,67); // 67 41 B

        System.out.printf("%010d,%07d\n",12345,12345); // 0000012345,0012345
        System.out.printf("%+010d,%+07d",12345,-12345); // +000012345,-012345

    }
}
