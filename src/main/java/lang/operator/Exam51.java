package lang.operator;

public class Exam51 {
    public static void main(String[] args) {
        System.out.println(57%2); // 2로 나눈 나머지 = 1
        System.out.println(57 & 0b0000_0001); // 맨 뒤 1비트의 값 추출. 2로 나눈 나머지와 동일
        System.out.println(57&1);

        System.out.println(57%4);
        System.out.println(57& 0b0000_0011); // 4로 나눈 나머지

        System.out.println((57 & 0x1)==0?"짝수":"홀수");
    }
}
