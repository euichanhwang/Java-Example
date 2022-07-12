package lang.operator;

public class Exam54 {
    public static void main(String[] args) {
        int i = 0x27_a1_30_ff;
        int a,b,c,d;
        System.out.println(i);
        System.out.println(Integer.toHexString(i));

        // i 변수에 들어있는 값 순서대로 잘라서 a,b,c,d 변수에 넣은 후 각 변수의 값 16진수로 출력
        a = i >> 24;
        b = i >> 16 & 0xff;
        c = i >> 8 & 0xff;
        d = i & 0xff;
        System.out.println(Integer.toHexString(a)); // 27
        System.out.println(Integer.toHexString(b)); // a1
        System.out.println(Integer.toHexString(c)); // 30
        System.out.println(Integer.toHexString(d)); // ff
    }
}
