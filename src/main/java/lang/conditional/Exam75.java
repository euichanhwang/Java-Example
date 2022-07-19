package lang.conditional;

import java.util.Scanner;

public class Exam75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(str);

        for(int i=0; i < num; i++) {
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
