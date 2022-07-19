package lang.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam73 {
    public static void main(String[] args) {
        //== 현재시간 구하기==//
        long curTime = System.currentTimeMillis(); // 1970년 1월 1일부터 경과한 시간 long 값으로 리턴. 밀리세컨(1/1000) 초 값을 리턴
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String str = timeFormat.format(new Date(curTime));

        System.out.println(str);
        System.out.println(new Date(curTime));

        //== 실행시간 구하기==//
        long start = System.currentTimeMillis();
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("실행시간: "+(end-start)/1000 + "초");


    }
}
