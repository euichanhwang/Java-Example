package lang;

public class Exam13 {
    public static void main(String[] args) {
        System.out.println(65);
        System.out.println((char)65); //A
        System.out.println((char)0x41); //A
        System.out.println((char)0xAC00); //가
        System.out.println((char)(0xAC00+1)); //각
        for(int i=0;i<26;i++){
            System.out.printf((char)(i+65)+" ");
        }
    }
}
