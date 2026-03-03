package day14;

public class Practice16 {

    public static void main(String[] args) {
        DeliveryTask task = new DeliveryTask();
        Thread thread1 = new Thread(task);
        thread1.start();

        for(int i=1; i<=3; i++) {
            System.out.println("[메인] 주문 화면 갱신 " + i);
            try {Thread.sleep(1000);}
            catch(Exception e) {}
        }

        try {thread1.join();}
        catch(Exception e) {}
        System.out.println("[안내] 배달 처리 종료");
    }
}

class DeliveryTask implements Runnable {

    @Override
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println("[배달기사] 이동중 " + i);
            try {Thread.sleep(1000);}
            catch(Exception e) {}
        }
    }
}