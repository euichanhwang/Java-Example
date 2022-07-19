package lang.conditional;

public class Exam66 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.println(j+ " ");
                if(j==5) break;
            }
            System.out.println();
        }
    }
}
