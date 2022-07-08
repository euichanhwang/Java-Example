package lang.variable;

public class Exam22 {
    public static void main(String[] args) {
        // boolean default = false;
        // char 타입의 크기는 2byte
        char ch = 'A';
        int code = (int)ch;// ch에 저장된 값을 int 타입으로 변환하여 저장.
        System.out.printf("%c=%d(%#X)\n",ch,code,code);//A=65(0X41). 문자, 정수, 16진수로 출력
        char hch = '가';
        System.out.printf("%c=%d(%#X)\n",hch,(int)hch,(int)hch);//가=44032(0XAC00)

        // char 타입은 문자를 저장할 변수 선언하기 위한 것이지만 실제로는 문자가 아닌 '문자의 유니코드(정수)'가 저장.
        // 표현형식 역시 정수형과 동일. 다만, 정수형과 달리 음수 나타낼 필요 없으므로 표현할 수 있는 값의 범위가 다름.
        // 0~65536의 범위를 가짐.
        // println()은 변수의 타입이 정수형이면 변수에 저장된 값을 10진수로 해석하여 출력. 문자형이면 저장된 숫자에 해당하는 유니코드 문자 출력.
    }
}
