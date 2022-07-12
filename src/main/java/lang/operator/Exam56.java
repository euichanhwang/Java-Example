package lang.operator;

public class Exam56 {
    public static void main(String[] args) {
        int i = 2;
        int result = i++ + i++ * i++;
        // int result = 2 + i++ * i++; => i = 3
        // int result = 2 + 3 * i++; => i = 4
        // int result = 2 + 3 * 4; => i = 5
        // int result = 2 + 12;
        // int result = 14;
        System.out.printf("i=%d,result=%d\n",i,result); // 5,14
    }
}
