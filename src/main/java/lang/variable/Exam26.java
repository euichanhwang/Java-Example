package lang.variable;

public class Exam26 {
    public static void main(String[] args) {
        int v = 0x41;
        for (int i=0;i<26;i++){
            System.out.print(v+i);
            System.out.print(' ');

            /*
               System.out.print((char)(v+i));
               System.out.print(' ');
             */
        }
    }
}
