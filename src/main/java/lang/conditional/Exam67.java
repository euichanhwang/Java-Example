package lang.conditional;

public class Exam67 {
    public static void main(String[] args) {
        loop1: {
            for(int i=1;i<=10;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j + " ");
                    if(j==5) break loop1;
                }
                System.out.println();
            }
            System.out.println("------------------------");
        }
        System.out.println("Loop1 밖");
    }
}
