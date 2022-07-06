package lang;

public class Exam10 {
    public static void main(String[] args) {
        // 덧셈 연산자는 왼쪽에서 오른쪽의 방향으로 연산 수행
        // 결합 순서에 따라 결과가 달라짐
        System.out.println(7 + " ");//7
        System.out.println(" " + 7);// 7
        System.out.println(7 + ""); //7
        System.out.println("" + 7); //7
        System.out.println(""+"");  //
        System.out.println(7+7+""); //14
        System.out.println(""+7+7); //77
    }
}
