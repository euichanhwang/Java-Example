package lang;

public class Exam11 {
    public static void main(String[] args) {
        //printf와 지시자 사용
        byte b = 1;
        short s = 2;
        char c = 'A';
        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;
        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;
        System.out.printf("b=%d\n",b);
        System.out.printf("s=%d\n",s);
        System.out.printf("c=%c, %d\n",c,(int)c); //%c = 문자로 출력, A, 65
        System.out.printf("finger=[%5d]\n",finger); //finger=[   10] //5자리 표현, 공백 ~~~ 10이 채워짐
        System.out.printf("finger=[%-5d]\n",finger);//finger=[10   ] //5자리 표현, 좌측부터 채워짐
        System.out.printf("finger=[%05d]\n",finger);//finger=[00010] //5자리 표현, 빈자리는 0으로 채워짐
        System.out.printf("big=%d\n",big);
        System.out.printf("hex=%#x\n",hex); //%x와 %o에 #을 사용하면 '0x'와 '0'이 각각 붙는다.
        System.out.printf("hex=%#X\n",hex); //16진수 대문자 출력
        System.out.printf("octNum=%o,%d\n",octNum,octNum);//10,8
        System.out.printf("hexNum=%x,%d\n",hexNum,hexNum);//10,16
        System.out.printf("binNum=%s,%d\n",Integer.toBinaryString(binNum),binNum);//10,2.
        //정수를 2진 문자열로 변환해주는 Integer.toBinaryString(int i)사용. 이 메서드는 정수를 2진수로 변환해서 문자열로 반환한다.

    }
}
//        b=1
//        s=2
//        c=A, 65
//        finger=[   10]
//        finger=[10   ]
//        finger=[00010]
//        big=100000000000
//        hex=0xffffffffffffffff
//        hex=0XFFFFFFFFFFFFFFFF
//        octNum=10,8
//        hexNum=10,16
//        binNum=10,2
