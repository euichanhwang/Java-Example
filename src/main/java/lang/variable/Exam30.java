package lang.variable;

public class Exam30 {
    public static void main(String[] args) {
        float f = 91234567;
        int i  = (int)f; // int는 최대 10자리의 정밀도 요구
        System.out.println(f);
        System.out.println(i); // 91234568
    }
}
