package lang.variable;

public class Exam19 {
    public static void main(String[] args) {
        //%f가 주로 쓰이고, %e는 지수형태로 출력할 때, %g는 값을 간략하게 표현할 때 사용
        //%f는 기본적으로 소수점 아래 6자리까지만 출력
        String url = "www.codechobo.com";

        float f1 = .10f; //0.10
        float f2 = 1e1f; //10.0
        float f3 = 3.14e3f;
        double d = 1.23456789;
        System.out.printf("f1=%f, %e, %g\n",f1,f1,f1); //f1=0.100000, 1.000000e-01, 0.100000
        System.out.printf("f1=%f, %e, %g\n",f2,f2,f2);
        System.out.printf("f1=%f, %e, %g\n",f3,f3,f3);
        System.out.printf("d=%f\n",d);
        System.out.printf("d=%14.10f\n",d); //전체 14자리 중 소수점 10자리
        // 지정된 숫자보다 문자열의 길이가 작으면 빈자리는 공백으로 출력.
        // 공백이 있는 경우 기본적으로 우측 끝에 문자열을 붙임. '-'를 붙이면 좌측 끝에 붙임.
        System.out.printf("[%s]\n",url);
        System.out.printf("[%20s]\n",url);
        System.out.printf("[%-20s]\n",url);
        System.out.printf("[%.8s]\n",url); //왼쪽에서 8글자만 출력







    }
}
