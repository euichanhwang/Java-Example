package lang.basic;

public class Exam05 {
    //IEEE-754 format에 따라 부동소수점을 2진수로 변경할 때 정확하게 2진수로 딱 떨어지지 않는 경우가 있다.
    static double d = 7*0.1;
    public static void main(String[] args) {
        System.out.println(String.format("%.1f",d)); //0.7
        System.out.println(d); //0.7000000000000001
    }
}
