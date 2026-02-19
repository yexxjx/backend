package day14;

import javax.xml.namespace.QName;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam4 {
    public static void main(String[] args) {

        /*
        Thread Pool
        1. 정의: 미리 일정 개수의 Thread를 생성하고 필요에 따라 재사용하는 방식
        2. 목적: 작업이 들어올 때마다 새로운 스레드가 아닌 기존 스레드 이용
        3. 효과: Thread 재사용, 자원효율성, 서버과부하 방지 등등
        4. 구조: '큐(자료의 데이터를 요청 순서대로 처리 방법)'라는 자료구조를 배치하여 순서대로 스레드풀에서 대기중인 스레드에게 작업 배정
        5. 큐 예시
        6. 사용처: 1) 서버프로그램 2) 채팅 3) 대기프로그램 4) SPRING 프래임워크
        7. 사용법: 1) ExecutorService executorService= Executors.newFixedThreadPool(총스레드수);
                  2) executorService.submit(스레드객체);

         */
        // [1] 작업 스레드 배정/만들기, 3 = 총 3개의 스레드가 돌아가면서 작업 처리한다
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        // [2] 여러 스레드를 만들어서 각 스레드를 작업스레드풀에 등록하기
        for(int i=1; i<=10; i++){
            String name= "Thread: " + i; // 스레드 이름 배정
            // [3] 작업 스레드 생성
            Runnable runnable=new Runnable() {
                @Override
                public void run() {
                    try{Thread.sleep(1000+new Random().nextInt(1000));}
                    catch(Exception e){}
                    System.out.println("작업중인 스레드: " + name);
                }
            };
            // [4] 생성된 작업스레드를 스레드풀에 등록한다
            executorService.submit(runnable); // 만일 스레드풀에 대기중인 스레드가 있으면 실행, 아니면 대기
        }
        // [5] 스레드풀 종료(스레드풀에 저장된 모든 스레드 안전하게 종료)
        executorService.shutdown();
    }
}
