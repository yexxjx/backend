package day14;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;

public class Exam2 {
    public static void main(String[] args) {

        // [시계 스레드 만들기]
        TimeThread timeThread=new TimeThread();
        Thread thread1=new Thread(timeThread);
        thread1.start();

        // [타이머 스레드 만들기]
        TimerThread timerThread=new TimerThread();
        timerThread.start();

        //[ MAIN THREAD 입력 ]
        for( ; ; ){
            System.out.println("타이머 : 1) ON 2) OFF");
            Scanner scan=new Scanner(System.in);
            int ch= scan.nextInt();
            if(ch==1){
                timerThread=new TimerThread();
                timerThread.state=true;
                timerThread.start();
            }
            else if(ch==2){
                if(timerThread!=null){
                    // timerThread.stop(); 가능하지만 비권장
                    timerThread.state=false; // 멤버 변수로 상태 관리
                }
            }
        }
    }
}

class TimeThread implements Runnable{
    @Override
    public void run() { // run 정의
        for( ; ; ){ // 무한 루프
            System.out.println(LocalTime.now());
            // main 스레드가 아닌 현재 작업스레드 1초간 일시 정지
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
}

class TimerThread extends Thread{
    boolean state=false;

    @Override
    public void run() {
        int second=0; // 타이머가 계산하는 초
        for( ; ; ){
            if(state==false) break;
            second++;
            System.out.printf("[타이머]: %d초 \n", second);
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
}