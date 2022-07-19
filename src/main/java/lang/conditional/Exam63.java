package lang.conditional;

public class Exam63 {
    public static void main(String[] args) {
        int i = 0;

        do
            System.out.println(++i); // 한 문장일 때는 블록이 없어도 된다.
        while(i<10);

        System.out.println("----------------------");

        i = 0;
        do {
            i += 1;
            System.out.println(i);
        }while(i<10);
    }
}
