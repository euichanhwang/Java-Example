package lang.conditional;

public class Exam61 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        while (count < 100) {
            count++;
            if (count % 2 == 1) continue;
            sum += count;
        }
        System.out.printf("count=%d,sum=%d\n",count,sum);
    }
}

