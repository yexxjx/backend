package day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice16 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=3; i++){
                    try{Thread.sleep(1000);}
                    catch (Exception e){}
                }
            }
        };

        Thread thread1=new Thread(runnable);
        thread1.start();
        for(int i=1; i<=3; i++){
            try{Thread.sleep(1000);}
            catch (Exception e){}
        }
    }
}
class DeliveryTask implements Runnable{
    @Override
    public void run() {
        for( ; ; ){
            System.out.println("[배달기사] 이동중");
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
}