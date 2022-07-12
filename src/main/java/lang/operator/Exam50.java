package lang.operator;

public class Exam50 {
    public static void main(String[] args) {
        double d1 = 987.6543;
        double d2 = 1.111111;
        double x = 234.765411;
        double y = 754.0;

        double EPSILON = 0.00001;
        System.out.println(Math.abs((d1+d2)-(x+y))<EPSILON);
    }
}
