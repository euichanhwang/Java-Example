package lang.conditional;

public class Exam68 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            for(int j=0;j<=i;j++){
                if(j%2==0) continue;
                System.out.println(j+ " ");
            }
            System.out.println();
        }
    }
}
