package lang.conditional;

public class Exam60 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        while(count<100) {
            sum += ++count;
        }
        System.out.printf("count=%d,sum=%d\n",count,sum);
    }
}
