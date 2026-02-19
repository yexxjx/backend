package day14;

public class Exam3 {
    public static void main(String[] args) {

        // [동기화 VS 비동기화], 메소드들은 비동기화 상태
        /*
        [동기화]
        1. 정의: 메소드/기능에 Lock(락) 사용하여 메소드를 점령하는 상태
        2. 목적: 서로 다른 여러 스레드가 동시에 하나의 메소드에 사용한다면 충돌 발생할 수도 있음
        3. 비교:
            동기화                               비동기화
            처리순서 보장                         처리순서 비보장
            주문순서대로 음료 제조 후 손님에게 줌     제조가 먼저 완성된 음료를 손님에게 줌
        4. 사용법
            synchronized 타입명 메소드명(){}

         */

        // Calculator 객체 생성
        Calculator calculator=new Calculator();

        // WorkThreadA
        WorkThreadA workThreadA=new WorkThreadA();
        workThreadA.calculator=calculator;

        // WorkThreadB
        WorkThreadB workThreadB=new WorkThreadB();
        workThreadB.calculator=calculator;

        // 2개의 Thread가 동일한 Calculator 객체를 멤버 변수로 가질 때
        workThreadA.start();
        workThreadB.start();
    }
}

class Calculator{
    int memory;
    // public void setMemory(int memory){
    public synchronized void setMemory(int memory){ // synchronized 넣으면 순서대로 100, 200 나옴
        // this란? 현재 메소드를 실행한 객체라는 뜻
        this.memory=memory;
        try{Thread.sleep(2000);} // 2초간 스레드 일시 중지
        catch(Exception e){}
        System.out.println(Thread.currentThread().getName());
        System.out.println("경고: " + this.memory);
    }
}

class WorkThreadA extends Thread{
    Calculator calculator;
    @Override
    public void run() {
        calculator.setMemory(100); // 계산기에 100 넣었을 때
    }
}

class WorkThreadB extends Thread{
    Calculator calculator;
    @Override
    public void run() {
        calculator.setMemory(200); // 계산기에 200 넣었을 때
    }
}